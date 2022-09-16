interface Cover { //인터페이스 정의
    public abstract void call();
}

public class Interface4 {
    public static void main(String[] args) {
        User2 user2 = new User2();
        //Provider provider = new Provider();
        //user2.callProvider(new Provider());
        user2.callProvider(new Provider2());
    }
}

class User4 {
    public void callProvider(Cover cover) { //매개변수의 다형성 활용
        cover.call();
    }
}

class Provider4 implements Cover {
    public void call() {
        System.out.println("야호~");
    }
}

class Provider3 implements Cover {
    public void call() {
        System.out.println("야호!!");
    }
}