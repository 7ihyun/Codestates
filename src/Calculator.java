import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        //연산자의 종류 +, -, *, /
        //소수점 연산 수행이 가능한 계산기 만들기
        System.out.println("첫 번째 숫자를 입력하세요.");
        String first = input.nextLine();
        System.out.println("연산자를 입력하세요.");
        String op = input.nextLine();
        System.out.println("두 번째 숫자를 입력하세요.");
        String second = input.nextLine();

        double num1 = Double.parseDouble(first);
        double num2 = Double.parseDouble(second);
        double num3;

        if (op.equals("+")) { //계산 수행
            num3 = num1 + num2;
        }
        else if (op.equals("-")) {
            num3 = num1 - num2;
        }
        else if (op.equals("/")) {
            num3 = num1 / num2;
        }
        else {
            num3 = num1 * num2;
        }

        System.out.println(first+op+second+"="+num3);
    }
}
