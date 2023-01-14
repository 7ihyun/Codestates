public class ThreadExample3 {
    public static void main(String[] args) {

        Runnable threadTask3 = new ThreadTask3();
        Thread thread3_1 = new Thread(threadTask3);
        Thread thread3_2 = new Thread(threadTask3);

        thread3_1.setName("신짱구");
        thread3_2.setName("신짱아");

        thread3_1.start();
        thread3_2.start();
    }
}
class Account {
    //잔액을 나타내는 변수
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    //인출이 성공하면 true, 실패하면 false
    public synchronized boolean withdraw(int money) { //synchronized 키워드로 메서드 전체를 임계 영역으로 지정
//        synchronized (this) { ... } /* 특정 영역을 임계 영역으로 지정*/

        //인출 가능 여부 판단 (잔액이 인출하고자 하는 금액보다 같거나 많아야 함)
        if (balance>=money) {
            /*
            if문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고 다른 스레드에게 제어권을 강제로 넘김
            문제 상황을 발생시키기 위한 코드
             */
            try {Thread.sleep(1000);} catch (Exception error) {}

            //잔액에서 인출금을 뺀 새로운 잔액을 기록
            balance -= money;

            return true;
        }
        return false;
    }
}
class ThreadTask3 implements Runnable {
    Account account = new Account();

    @Override
    public void run() {
        while (account.getBalance() > 0) {
            //100~300원의 인출금을 랜덤으로 설정
            int money = (int)(Math.random() * 3 + 1) * 100;

            //withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당
            boolean denied = !account.withdraw(money);

            //인출 결과 확인
            //withdraw가 flase를 리턴(인출 실패)했다면 DENIED를 출력
            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : ""));
        }
    }
}
/*
신짱구에 의해 100원이 인출되었는데, 잔액이 900원이 아닌 600원으로 출력되고 있음
또한, 음수인 잔액이 발생하고 인출에 실패한 경우 -> DENIED가 제대로 출력되지 않는 문제도 발생함

이런 상황이 발생하지 않게 하는 것을 "스레드 동기화"
 */

/*
임계 영역 지정 후 정상 출력
 */
