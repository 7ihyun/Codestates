public class CarTest {
    public static void main(String[] args) {
        //객체 생성
        Car bmw = new Car("Model 1", "흰색"); //Car 클래스를 기반으로 생성된 bmw 인스턴스
        Car tesla = new Car("Model 2", "빨간색"); //Car 클래스를 기반으로 생성된 tesla 인스턴스
        Car audi = new Car("Model 3", "검정색"); //Car 클래스를 기반으로 생성된 audi 인스턴스

        //필드 호출
        System.out.println("제 차의 모델은 " + tesla.model + "이고 색상은 " + tesla.color + "입니다.");

        //메서드 호출
        tesla.power();
        tesla.accelerate();
        tesla.stop();
    }
}
class Car {
    public String model; //필드 선언
    public String color;

    public Car(String model, String color) { //인스턴스 초기화를 위한 생성자 함수. 이후 챕터에서 학습 예정.
        this.model = model;
        this.color = color;
    }

    void power() { //메서드 선언
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("속력을 높이세요.");
    }

    void stop(){
        System.out.println("멈추세요.");
    }
}