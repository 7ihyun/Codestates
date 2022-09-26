package Datastructure;

import java.util.*;

public class Ex11 {
    public static void main(String[] args) {
        boolean result = getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println(result);

        boolean result2 = getDirections(new int[][]
                        {
                                {0, 1, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 0},
                                {1, 1, 1, 1, 0}
                        },
                1,
                4
        );
        System.out.println(result);
    }
    public static boolean getDirections(int[][] matrix, int from, int to) {
        //TODO:
//        //재귀 함수 사용
//        //matrix를 수정하지 말아야 하므로 새로운 배열 선언
//        int[][] currentMatrix = new int[matrix.length][]; //2차원 배열 선언
//        for(int i = 0; i < matrix.length; i++) currentMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
//
//        if (from == to) return true; //출발점과 도착점이 같은 경우 (재귀 함수의 도착지점 )
//
//        for (int i = 0; i < currentMatrix[from].length; i++) {
//            //길이 존재하는 경우
//            if (currentMatrix[from][i] == 1) {
//                currentMatrix[from][i] = 0; //1을 0으로 변경
//
//                //행렬과 출발지점을 현재 지점인 i로 변경해 재귀함수 실행
//                //재귀함수가 끝까지 도달했을 때, true를 반환한 경우 true
//                if(getDirections(currentMatrix, i, to)) return true;
//            }
//        }
//        //길을 찾을 수 없는 경우
//        return false;

        //큐 사용
        Queue<Integer> queue = new LinkedList<>(); //큐 선언
        queue.add(from); //첫 시작지점으로 from 할당

        //방문여부를 표시하기 위해 1차원 배열 생성 (초기값 false)
        boolean[] isVisited = new boolean[matrix.length];
        //첫 정점 방문여부
        isVisited[from] = true;

        while(queue.size() > 0) {
            int now = queue.poll(); //큐에서 정점을 하나 빼서 now에 할당

            //목적지인지 검사, 목적지라면 true
            if(now == to) return true;

            //해당 정점의 간선 확인
            for(int next = 0; next < matrix[now].length; next++) {
                //간선이 있고 방문하지 않은 경우
                if(matrix[now][next] == 1 && !isVisited[next]) {
                    queue.add(next); //다음 정점으로 가기 위함
                    isVisited[next] = true; //해당 정점을 방문했다는 것을 표시
                }
            }
        }
        //길을 찾을 수 없는 경우
        return false;
    }
}
