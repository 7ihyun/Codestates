public class InstanceOfTest {

    public static void main(String[] args) {
        Person programmer = new Programmer();

        System.out.println(programmer instanceof Object);
        System.out.println(programmer instanceof Singer);
        System.out.println(programmer instanceof Person);
        System.out.println(programmer instanceof Programmer);
    }

}

class Person {};
class Programmer extends Person{};
class Singer extends Person{};