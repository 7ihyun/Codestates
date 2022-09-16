public class StaticTest {
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println("인스턴스 변수: " + staticExample.num1); //static 키워드가 없는 인스턴스 변수
        System.out.println("클래스 변수: " + StaticExample.num2); //static 키워드가 있는 클래스 변수
    }
}
class StaticExample {
    int num1 = 10;
    static int num2 = -10;
}