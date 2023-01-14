package RecursiveFunction;

public class Ex03 {
    public int factorial(int num) {
        //더 이상 쪼갤 수 없는 경우
        if (num <= 0) return 1; //factorial(0) 은 1로 간주

        //쪼갤 수 있는 경우
        return num * factorial(num-1);
        /*
        int head = num;
        int tail = num-1;
        return head * factorial(tail);
         */
    }
}
