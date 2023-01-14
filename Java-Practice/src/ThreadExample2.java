public class ThreadExample2 {
    public static void main(String[] args) {
        //Thread 클래스를 상속받은 클래스를 인스턴스화하여 스레드 생성
        ThreadTask2 thread2 = new ThreadTask2();

        //작업 스레드를 실행시켜 run() 내부의 코드를 처리
        thread2.start();

        for (int i=0; i<100; i++) System.out.println("@");
    }
}
//Thread 클래스를 상속받는 클래스 작성
class ThreadTask2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<100; i++) System.out.println("#");
    }
}