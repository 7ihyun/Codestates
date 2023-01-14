package RecursiveFunction;

import java.util.Arrays;

public class Ex08 {
    public int[] drop(int num, int[] arr) {
//        if (num >= arr.length) return new int[]{}; //빈 배열인 경우 빈 배열을 리턴
//        if (num ==0) return arr;
        //더 이상 쪼갤 수 없는 경우
        if (num == 0 || arr.length == 0) return arr;

        //쪼갤 수 있는 경우
        return drop(num -1, Arrays.copyOfRange(arr, 1, arr.length));
    }
}
