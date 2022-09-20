package RecursiveFunction;

public class Ex02 {
    public boolean isOdd(int num) {
        if (num == 0) return false; //num = 0 이면 짝수
        if (num == 1) return true; //num = 1 이면 홀수

        if (num < 0) return isOdd(-num);
        return isOdd(num - 2); //%2와 같음. -2로 홀짝 구분
    }
}
