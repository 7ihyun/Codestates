package Algorithm;

import java.util.*;

public class Ex08 {
    public static void main(String[] args) {
        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output = divideChocolateStick(M, N);
        System.out.println(output);
    }
    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:
        ArrayList<Integer[]> result = new ArrayList<>();
        // 최대공약수 구하기
        int GCD = gcd(M, N);
        // 약수는 대칭적이므로 제곱근까지 반복한다.
        int sqrt = (int) Math.floor(Math.sqrt(GCD));

        for (int i = 1; i <= sqrt; i++) {
            if (GCD % i == 0) {
                // 최대공약수의 약수인 경우 중에 제곱근 보다 작은 약수의 경우
                result.add(new Integer[]{i, M / i, N / i});
                if(i * i < GCD) {
                    // 제곱근이 아닌 경우(제곱근 보다 작은 경우)
                    int right = GCD / i;     // 최대 공약수를 제곱근이 아닌 수로 나누면 제곱근 보다 큰 약수를 구할 수 있다.
                    result.add(new Integer[]{right, M / right, N / right});
                }
            }
        }
        // 빼빼로를 받게 되는 직원의 수를 기준으로 오름차순으로 정려한다.
        Collections.sort(result, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        return result;
    }
    // 최대공약수(유클리드 호제법: Euclidean algorithm)
    public static int gcd(int m, int n) {
        if (m % n == 0) return n;
        return gcd(n, m % n);
    }
}
