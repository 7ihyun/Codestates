package RecursiveFunction;

public class Ex01 {
    public int sumTo(int num) {
        if (num == 0) return 0;
        return num + sumTo(num-1);
    }
}
