import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));

        //TODO:
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("전력 사용량을 입력하세요.");

                int usage = sc.nextInt(); //사용한 전력량
                double amount = 0; //전기요금

                if (usage > 0 && usage <= 100) {
                    amount = usage * 60.7; //1kWh당 60.7원
                } else if (usage <= 200) {
                    amount = (100 * 60.7) + (usage - 100) * 125.9;
                } else if (usage <= 300) {
                    amount = (100 * 60.7) + (100 * 125.9) + (usage - 200) * 187.9;
                } else if (usage <= 400) {
                    amount = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (usage - 300) * 280.6;
                } else if (usage <= 500) {
                    amount = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (100 * 280.6) + (usage - 400) * 417.7;
                } else {
                    amount = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (100 * 280.6) + (100 * 417.7) + (usage - 500) * 670.6;
                }
                System.out.println(usage + "kWh의 전기 요금은 " + amount + "원 입니다.");
                break;
            }
            catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                e.printStackTrace();
                break;
            }
        }
    }
}