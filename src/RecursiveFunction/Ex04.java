package RecursiveFunction;

public class Ex04 {
    public int fibonacci (int num) {
        //더 이상 쪼갤 수 없는 경우
        if (num == 0) return 0; //피보나치 수열. 0과 1은 고정
        if (num == 1) return 1;
//        if (num <= 1) return num;

        //쪼갤 수 있는 경우
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}
