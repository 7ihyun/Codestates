public class ThreadExample4 {
    public static void main(String[] args) {

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Set And Get Thread Name");
            }
        });
        //스레드의 이름은 스레드참조값.getName() 으로 조회할 수 있음
        thread4.start();
        System.out.println("thread4.getName() = " + thread4.getName());

        thread4.setName("Code");
        System.out.println("thread4.getName() = " + thread4.getName());
    }
}
