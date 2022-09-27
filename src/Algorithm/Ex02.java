package Algorithm;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        // 4000원을 받았을 때 500원짜리 동전 8개를 반환한다.
        int output1 = partTimeJob(4000);
        System.out.println(output1); // --> 8

        // 4972원을 받았을 때 500원짜리 동전 9개, 100원짜리 동전 4개, 50원짜리 동전 1개, 10원짜리 동전 2개, 1원짜리 동전 2개, 총 18개를 반환한다.
        int output2 = partTimeJob(4972);
        System.out.println(output2); // --> 18
    }
    public static int partTimeJob(int k) {
        // TODO:
        // 결과를 반환할 값
        int result = 0;
        // 동전의 종류를 배열에 넣는다
        int[] coin = new int[] {500, 100, 50, 10, 5, 1};
        // 동전의 배열만큼 배열을 순회한다
        for (int i = 0; i < coin.length; i++) {
            // 총 금액이 0보다 크다면
            if (k > 0) {
                // 총 금액을 현재 동전으로 나눠 동전의 총 갯수를 구한다.
                int sum = (int) Math.floor((double) k / coin[i]);
                // 동전의 갯수를 결과에 더한다.
                result += sum;
                // 총 금액에 사용한 동전의 금액을 차감한다.
                k -= (coin[i] * sum);
            }
        }
        // 결과를 반환한다.
        return result;
    }
}
