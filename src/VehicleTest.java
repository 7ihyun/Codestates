public class VehicleTest {
    public static void main(String[] args) {
        Car_ car = new Car_();
        Vehicle vehicle = (Vehicle) car; //위 클래스 Vehicle 타입으로 변환(생략 가능)
        Car_ car2 = (Car_) vehicle; //하위 클래스 Car타입으로 변환(생략 불가능)
        //MotorBike motorBike = (MotorBike) car; //에러 발생 : 상속관계가 아니므로 타입 변환 불가
    }
}
class Vehicle {
    String model;
    String color;
    int wheels;

    void startEngine() {
        System.out.println("시동 걸기");
    }

    void accelerate() {
        System.out.println("속도 올리기");
    }

    void brake() {
        System.out.println("브레이크!");
    }
}

class Car_ extends Vehicle {
    void giveRide() {
        System.out.println("다른 사람 태우기");
    }
}

class MotorBike extends Vehicle {
    void performance() {
        System.out.println("묘기 부리기");
    }
}
