public class CarTest {
    public static void main(String[] args) {

        Car tesla = new Car("Model 3", "black"); // 객체 생성

        // 필드 호출
        System.out.println("내 차의 모델은 " + tesla.model + "이고 " + "색상은 " + tesla.color + "입니다.");

        //메서드 호출
        tesla.power();
        tesla.accelerate();
        tesla.stop();
    }
}
    class Car {
        public String model; //필드 선언
        public String color;

        //인스턴트 초기화를 위한 생성자 함수
        public Car(String model, String color) {
            this.model = model;
            this.color = color;
        }

        void power() { //메서드 선언
            System.out.println("시동을 걸었습니다.");
        }
        void accelerate() {
            System.out.println("속도를 높이세요!");
        }
        void stop() {
            System.out.println("멈추세요!");
        }
    }
