package Algorithm;


public class Ex04 {
    public static void main(String[] args) {
        long output1 = ocean(50, new int[]{10, 20, 50});
        System.out.println(output1); // 4

        long output2 = ocean(100, new int[]{10, 20, 50});
        System.out.println(output2); // 10

        long output3 = ocean(30, new int[]{5, 6, 7});
        System.out.println(output3); // 4
    }
    public static long ocean(int target, int[] type) {
        // TODO:
        // 인덱스는 1부터 시작한다.
        long[] bag = new long[target + 1];
        // 경우의 수를 저장하기 위해 초기값을 0으로 한다.
        bag[0] = 1;
        // 돈의 종류가 담긴 배열을 순차적으로 탐색한다.
        for (int i = 0; i < type.length; i++) {
            // target 까지 순차적으로 1씩 증가시키며 반복한다.
            for (int j = 1; j <= target; j++)
                // bag의 인덱스가 type[i] 보다 큰 경우
                // 기존 경우의 수에 type[i]를 뺀 금액을 더해준다.
                if(type[i] <= j) bag[j] += bag[j-type[i]];
                // bag의 인덱스가 type[i] 보다 작은 경우는 type[i]로 만들 수 없는 금액이므로, 탐색할 필요가 없다.
        }
        // bag의 target 인덱스에 taget 금액을 훔칠 수 있는 경우의 수가 누적되므로 해당 값을 리턴한다.
        return bag[target];
    }
}

