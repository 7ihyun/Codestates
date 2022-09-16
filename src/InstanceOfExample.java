public class InstanceOfExample {
    public static void main(String[] args) {
        Animals animals = new Animals();
        System.out.println(animals instanceof Object); //true
        System.out.println(animals instanceof Animals); //true
        System.out.println(animals instanceof Bat); //false

        Animals tiger = new Tiger();
        System.out.println(tiger instanceof Object); //true
        System.out.println(tiger instanceof Animals); //true
        System.out.println(tiger instanceof Tiger); //true
        System.out.println(tiger instanceof Bat); //false
    }
}

class Animals {};
class Bat extends Animals{};
class Tiger extends Animals{};