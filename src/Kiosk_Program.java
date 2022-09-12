import java.util.Scanner;

// Kiosk_Program 클래스를 정의 합니다.
public class Kiosk_Program {
    static Scanner sc = new Scanner(System.in); //메뉴 입력 및 수량을 입력하기 위해 Scanner 객체 생성

    static int menu_1_cost = 1000; //메뉴의 가격(menu_n_cost)을 정의
    static int menu_2_cost = 1500;
    static int menu_3_cost = 1000;
    static int menu_4_cost = 2000;

    static void input_print() { //프로그램의 시작을 알리는 메서드
        System.out.println("[안내] 안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(50)); //@.repeat() 메서드는 해당 문자를 반복해서 출력
    }


    //사용자가 원하는 메뉴를 번호로 입력받는 메서드
    //메뉴에 없는 번호가 입력되면 다시 실행
    static int count() {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
        //sc == 최 상단에 입력받은 Scanner 객체
        //변수명이 다르다면 하단의 이름을 수정해야 합니다.
        int number = sc.nextInt();

        if (number <= 0 || number > 4) { //사용자가 입력한 번호의 조건이 0 이하 혹은 4 초과일 때
            System.out.println("[경고]메뉴에 포함된 번호를 입력하여 주세요.\n"); //경고 문구 출력
            count(); //다시 입력
        }

        if (1 == number) { //가격(menu_n_cost)을 number 변수에 재할당
            number = menu_1_cost;
        } else if (2 == number) {
            number = menu_2_cost;
        } else if (3 == number) {
            number = menu_3_cost;
        } else {
            number = menu_4_cost;
        }
        return number;
    }

    //수량 입력 및 가격 연산을 진행하는 메서드
    static int price;
    static void cost(int number) {
        System.out.println("-".repeat(50));
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요."); //안내문구 출력
        System.out.println("(※ 최대 주문 가능 수량 : 99)"); //수량은 1~99

        int count = sc.nextInt(); //입력받은 수량을 변수에 저장

        // 조건에 따라 문구를 출력하거나 재입력
        if (count <= 0 || count > 99) { //수량이 0 이하 또는 99 초과일 때
            System.out.println("[경고]" + count + "개는 입력하실 수 없습니다.)"); //경고 문구 출력
            System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
            cost(number); //다시 입력
        }
        price = number * count;
    }


     //최종 가격과 종료 문구를 출력하는 메서드
    static void output_print(int result) {
        System.out.println("-".repeat(50));
        System.out.println("[안내]주문하신 메뉴의 총 금액은 " + result + "원 입니다.");
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }

     //main() 메서드 동작
     //프로그램 실행 -> 메뉴 입력 -> 수량 입력 및 가격 계산 -> 가격 출력
    public static void main(String[] args) {
        input_print();
        cost(count());
        output_print(price);
    }
}
