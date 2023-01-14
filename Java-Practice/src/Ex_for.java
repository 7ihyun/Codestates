public class Ex_for {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            //i는 0, i가 10보다 작을 동안, i를 1씩 증가시켜라
            sum += i; //sum = sum + i 과 같음
        }
        System.out.println(sum);
    }
}
