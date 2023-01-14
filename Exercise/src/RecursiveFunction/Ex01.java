package RecursiveFunction;

public class Ex01 {
    public int sumTo(int num) {
        //더 이상 쪼갤 수 없는 경우
        if (num == 0) return 0;

        //쪼갤 수 있는 경우
        return num + sumTo(num-1);

//        int head = num;
//        int tail = num - 1;
//        return num + sumTo(num - 1);
    }
}