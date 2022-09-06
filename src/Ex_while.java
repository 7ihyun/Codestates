public class Ex_while {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 10) {
            //i는 0, i가 10보다 작을 동안, i를 1씩 증가시켜라
            sum += i; //sum = sum + i 과 같음
            i++;
        }
        System.out.println(sum);
    }
}
