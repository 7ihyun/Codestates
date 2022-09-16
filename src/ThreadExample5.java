public class ThreadExample5 {
    public static void main(String[] args) {
        Thread  thread5 = new Thread() {
            @Override
            public void run() {
                //static void sleep(long milliSecond) : milliSecond 동안 스레드를 잠시 멈춤
                try {
                    while (true) Thread.sleep(1000);
                }
                catch (Exception e) {}
                System.out.println("Woke Up!!");
            }
        };
        System.out.println("thread5.getState() = " + thread5.getState());

        thread5.start();

        System.out.println("thread5.getState() = " + thread5.getState());

        while (true) {
            if (thread5.getState() == Thread.State.TIMED_WAITING) {
                System.out.println("thread5.getState() = " + thread5.getState());
                break;
            }
        }
        thread5.interrupt();

        while (true) {
            if (thread5.getState() == Thread.State.RUNNABLE) {
                System.out.println("thread.getState() = " + thread5.getState());
                break;
            }
        }

        while (true) {
            if (thread5.getState() == Thread.State.TERMINATED) {
                System.out.println("thread.getState() = " + thread5.getState());
                break;
            }
        }
    }
}
/*
<출력 결과>
sleep()에 의해 일시 정지(TIMED_WAITING) 상태가 되었다가, interrupt()에 의해 다시 RUNNABLE로 상태가 변화함
이후 해당 스레드는 run()의 마지막 코드인 println()을 실행한 뒤에 종료되어 TERMINATE 상태가 됨
 */
