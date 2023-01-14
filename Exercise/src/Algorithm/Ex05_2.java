package Algorithm;

import java.util.*;

public class Ex05_2 {
    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(3);

        System.out.println(output);
    }
    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        // 결과를 담을 ArrayList를 선언한다.
        ArrayList<String[]> outcomes = new ArrayList<>();
        // 함수를 실행해 반환된 결과를 다시 반환한다.
        return permutation(0, rounds, new String[rounds], outcomes);
    }

    // 배열의 모든 요소의 경우의 수를 체크하기 위해 재귀 함수를 사용한다.
    // rounds를 넣을 변수 roundsToGo, 일회용 배열인 playedSoFar 변수를 선언한다.
    public static ArrayList<String[]> permutation(int curRounds, int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {
        // 재귀 탈출조건 (base case)
        if (roundsToGo == curRounds) {
            String[] arr = Arrays.copyOf(playedSoFar, playedSoFar.length);
            outcomes.add(arr);
            return outcomes;
        }
        // [rock, paper, scissors]를 요소로 갖는 str 배 열을 선언한다.
        String[] rps = new String[]{"rock", "paper", "scissors"};
        // rps 배열을 한 번씩 순회한다.
        for (int i = 0; i < rps.length; i++) {
            // rps의 i번째 요소를 변수에 담는다.
            String currentPlay = rps[i];
            playedSoFar[curRounds] = currentPlay;
            // 일회용 배열의 크기를 rounds만큼 맞춰주기 위해, rounds에서 1을 뺀다. [rock, rock, rock]
            outcomes = permutation(curRounds + 1, roundsToGo, playedSoFar, outcomes);
        }
        // 값을 반환한다.
        return outcomes;
    }
}
