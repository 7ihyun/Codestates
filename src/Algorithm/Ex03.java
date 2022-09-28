package Algorithm;

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int output1 = boardGame(board, "RRDLLD");
        System.out.println(output1); // 4

        int[][] board2 = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        int output2 = boardGame(board2, "UUUDD");
        System.out.println(output2); // null

        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        int output3 = boardGame(board3, "DDRRRUDUDUD");
        System.out.println(output3); // 0
    }
    // 이동이 가능한지 확인하고 boolean 으로 결과를 반환한다.
    public static boolean isValid(int y, int x, int len) {
        // 최솟값과 최댓값을 벗어나면 false, 가능하면 true를 반환한다.
        return 0 <= y && y < len && 0 <= x && x < len;
    }
    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        // 배열이나 연결리스트 사용해도 됨
        // HashMap을 선언하고, 입력되는 명령어에 따라 이동할 좌표를 넣는다.

        HashMap<String, int[]> DIR = new HashMap<String, int[]>(){{
            put("U", new int[]{-1, 0}); // 상
            put("D", new int[]{1, 0}); // 하
            put("L", new int[]{0, -1}); // 좌
            put("R", new int[]{0, 1}); // 우
        }};
        // 보드의 길이를 선언한다.
        int len = board.length;
        // 시작 좌표와 점수를 0으로 할당한다.
        int x = 0;
        int y = 0;
        int score = 0;
        // 입력받은 operation을 char 배열로 변환한다.
        char[] chars = operation.toCharArray();
        // 해당 배열만큼 반복한다.
        for (int i = 0; i < chars.length; i++) {
            int dX = DIR.get(String.valueOf(chars[i]))[1];
            int dY = DIR.get(String.valueOf(chars[i]))[0];

            x += dX;
            y += dY;

            // 이동이 불가한 경우, null을 반환한다.
            if (!isValid(y, x, len)) return null;
            // 이동이 가능한 경우, 해당 보드의 값만큼 점수에 더한다.
            score += board[y][x];
        }
        // 전체 점수를 반환한다.
        return score;

    }
}
