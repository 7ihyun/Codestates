public class ThreadExample1 {
    public static void main(String[] args) {
        //Runnable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();

        //Runnable 구현 객체를 인자로 전달하며 Thread 클래스를 인스턴스화해 스레드를 생성
        Thread thread1 = new Thread(task1);

        //한 줄로 축약 가능
        //Thread thread1 = new Thread(new ThreadTask1());

        thread1.start(); //run() 메서드 내부의 코드를 실행하기 위해 start() 메서드 호출

        for (int i=0; i<100; i++) System.out.println("@");
    }
}
//Runnable 인터페이스를 구현하는 클래스
class ThreadTask1 implements Runnable {
    public void run() { //메서드 바디에 스레드가 수행할 작업 내용을 작성
        for (int i=0; i<100; i++) System.out.println("#");
    }
}
/*
@는 main 메서드에 반복문에서 출력한 문자로, 메인 스레드의 반목문 코드 실행에 의해 출력됨
#은 run() 메서드의 반목문에서 출력한 문자로, 작업 스레드의 반목문 코드 실행에 의해 출력됨
@와 #이 섞여있는 것은 메인 스레드와 작업 스레드가 동시에 병렬도 실행되면서 각각 main 메서드와 run() 메서드의 코드를 실행시켰기 때문
 */