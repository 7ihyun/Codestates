package Datastructure;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        int output = queuePrinter(bufferSize, capacities, documents);
        System.out.println(output); // 8
    }
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        //ToDo :
        int count = 0; //몇 번 이동했는가 (1작업이 끝나면 1초 증가)

        Queue<Integer> queue = new LinkedList<>(); //Queue는 추상 인터페이스. LinkedList로 우선순위 큐 구현

        for (int i = 0; i < bufferSize; i++) { //작업 목록의 크기(bufferSize)만큼 반복
            queue.add(0);
        }

        queue.poll(); //poll() : 큐의 맨 앞에 있는 값을 반환 후 삭제 (비어있는 경우 null)
        queue.add(documents[0]); //첫 번째 문서가 들어옴
        documents = Arrays.copyOfRange(documents, 1, documents.length); //1번 인덱스부터 배열의 길이만큼 삭제 (=들어간 문서를 배열에서 삭제하는 작업)
        count++; //1초 증가

        //더 이상 문서가 없는 경우 && 대기열이 존재하지 않는 경우 -> stop
        //큐에 들어있는 모든 값의 합이 0인 경우
        while (documents.length != 0 || (queue.stream().reduce(0, Integer::sum) != 0)) {
            if (documents.length != 0) { //대기 중인 문서가 남은 경우
                int sum = queue.stream().reduce(0, Integer::sum) + documents[0]; //큐에 남아있는 모든 값의 합 + 나머지의 합

                if (sum > capacities) { //작업 중인 문서와 남은 문서의 크기를 더했을 때, capacities 보다 큰 경우 (10 초과)
                    queue.poll(); //문서를 내보냄

                    sum = queue.stream().reduce(0, Integer::sum) + documents[0];

                    //문서가 제거된 후, 남은 대기열의 첫 번째 문서를 포함했을 때, 수용이 가능한 경우
                    if (sum <= capacities) {
                        queue.add(documents[0]); //첫 번째 문서가 들어옴
                        documents = Arrays.copyOfRange(documents, 1, documents.length); //하나의 문서를 지움 (배열 줄이기)
                        count++;
                    }
                    //수용이 불가한 경우
                    else { //sum > capacities
                        queue.add(0); //문서의 합이 10을 초과해 들어올 수 없기 때문에 0이 들어옴
                        count++;
                    }
                }
                else { //작업 중인 문서와 남은 문서의 크기를 더했을 때, capacities 보다 작은 경우 (10 이하)
                    queue.poll(); //문서를 내보냄
                    queue.add(documents[0]); //첫 번째 문서가 들어옴
                    documents = Arrays.copyOfRange(documents, 1, documents.length); //하나의 문서를 지움 (배열 줄이기)
                    count++;
                }
            }
            else { //대기 중인 문서가 없는 경우
                queue.poll(); //한 칸씩 앞으로 밀어냄 [0,6] -> [6, ]
                queue.add(0); //비어있는 공간에 0을 추가 [6, ] -> [6,0]
                count++;
            }
        }
        return count;
    }
}