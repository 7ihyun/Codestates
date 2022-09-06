public class Person {
    String name;
    int age;

    void learn() {
        System.out.println("공부를 한다.");
    };
    void walk() {
        System.out.println("걷는다.");
    };
    void eat() {
        System.out.println("밥을 먹는다.");
    };
}
class Programmer extends Person { //Person 클래스로부터 상속 받음 (extends 키워드 사용)
    String companyName;

    void coding() {
        System.out.println("코딩을 합니다.");
    };
}
class Dancer extends Person {
    String groupName;

    void coding() {
        System.out.println("춤을 춘다.");
    };
}
class Singer extends Person {
    String bandName;

    void singing() {
        System.out.println("노래를 한다.");
    };
    void palyGuitar() {
        System.out.println("기타를 친다.");
    };
}
public class HelloJAva {
    public static void main(String[] args) {
        //Person 객체 생성
        Person p = new Person();
        p.name = "홍길동";
        p.age = 25;
        p.learn();
        p.eat();
        p.walk();
        System.out.println("p.name");

        //Programmer 객체 생성
        Programmer pg = new Programmer();
        pg.name = "신짱구";
        pg.age = 21;
        pg.learn(); //Person 클래스에서 상속받아 사용 가능
        pg.coding();//Programmer 개별 기능
        System.out.println(pg.name);
    }
}