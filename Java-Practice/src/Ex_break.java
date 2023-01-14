public class Ex_break {
    public static void main(String[] args) {
        Outer : for (int i = 3; i < 10; i++) { //i를 3~9까지 반복
            for (int j = 5; j > 0; j--) { //j를 5~1까지 반복
                System.out.println("i " + i + " j "+ j);
                if (i == 5) { //i의 값이 5가 되면 빠져나옴
                    break Outer;
                }
            }
        }
    }
}
