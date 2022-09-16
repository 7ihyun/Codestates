public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User(); //User 클래스 객체 생성
        user.callProvider(new Provider()); //Provider 객체 생성 후 매개변수로 전달
    }
}

class User { // User 클래스
    public void callProvider(Provider provider) { //Provider 객체를 매개변수로 받는 callProvider 메서드
        provider.call();
    }
}

class Provider { //Provider 클래스
    public void call() {
        System.out.println("야호~");
    }
}