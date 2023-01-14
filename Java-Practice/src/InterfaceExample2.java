public class InterfaceExample2 {
    public static void main(String[] args) {
        User2 user = new User2(); //User2 클래스 객체 생성
        user.callProvider(new Provider2()); //Provider객체 생성 후에 매개변수로 전달
    }
}
class User2 { //User2 클래스
    public void callProvider(Provider2 provider) { //Provider 객체를 매개변수로 받는 callProvider 메서드
        provider.call();
    }
}

class Provider2 { //Provider 클래스
    public void call() {
        System.out.println("야호!!");
    }
}
