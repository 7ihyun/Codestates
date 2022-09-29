package Algorithm;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(5);
        System.out.println(output);
    }

    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        // 결과를 담을 ArrayList를 선언한다.
        ArrayList<String[]> outcomes = new ArrayList<>();
        // 함수를 실행해 반환된 결과를 다시 반환한다.
        return permutation(rounds, new String[]{}, outcomes);
    }

    // 배열의 모든 요소의 경우의 수를 체크하기 위해 재귀 함수를 사용한다.
    // rounds를 넣을 변수 roundsToGo, 일회용 배열인 playedSoFar 변수를 선언한다.
    public static ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {
        // rounds가 0일 경우 result 배열에 삽입하고, 제귀를 탈출한다.
        if (roundsToGo == 0) {
            outcomes.add(playedSoFar);
            return outcomes;
        }
        // [rock, paper, scissors]를 요소로 갖는 str 배열을 선언한다.
        String[] str = new String[]{"rock", "paper", "scissors"};
        // str 배열을 한 번씩 순회한다.
        for (int i = 0; i < str.length; i++) {
            // str의 i번째 요소를 변수에 담는다.
            String currentPlay = str[i];
            // permutate(본인)에 기존 rounds에서 하나 뺀 숫자와, 일회용 배열 playedSoFar에 currentPlay를 삽입하여 재귀를 실행한다.
            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);  //배열의 크기를 하나 늘리고, currentPlay를 요소로 넣어준다.
            currentPlay = concatArray[concatArray.length - 1] ;
            // 일회용 배열의 크기를 rounds만큼 맞춰주기 위해, rounds에서 1을 뺀다. [rock, rock, rock]
            outcomes = permutation(roundsToGo - 1, concatArray, outcomes);
        }
        // 값을 반환한다.
        return outcomes;
    }
}
