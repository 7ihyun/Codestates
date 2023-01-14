package Algorithm;

public class Ex07 {
    public static void main(String[] args) {
        int output1 = boringBlackjack(new int[]{1, 2, 3, 4});
        System.out.println(output1); // 1

        int output2 = boringBlackjack(new int[]{2, 3, 4, 8, 13});
        System.out.println(output2); // 3
    }
    public static int boringBlackjack(int[] cards) {
        // TODO:
        // 카드 세 장을 조합해 소수가 되는 경우의 수
        int count = 0;
        // 1. 카드 3장 뽑기
        // 첫 번째 카드를 0번 인덱스에 고정해놓은 후, 1씩 뒤로 옮긴다.
        for (int i = 0; i < cards.length; i++) {
            // 두 번째 카드의 인덱스는 '세 번째 카드+1' 에서 시작한다.
            for(int j = i + 1; j < cards.length; j++) {
                // 세 번째 카드의 인덱스는 '두 번째 카드+1' 에서 시작한다.
                for (int k = j + 1; k < cards.length; k++) {
                    // 세 카드의 합이 소수라면, 경우의 수를 증가시킨다.
                    int number = cards[i] + cards[j] + cards[k];
                    if(isPrime(number)) count++;
                }
            }
        }
        return count;
    }
        // 2. 소수 판별하기
    public static boolean isPrime(int number) {
        // 2부터 비교해 소수를 판별한다.
        // number의 제곱근까지 비교한다.
        for(int i = 2; i <= Math.sqrt(number); i++) {
            // 나누어 떨어지는 수가 있다면 소수가 아니다.
            if(number % i == 0) return false;
        }
        return true;
    }
}
