package RecursiveFunction;

import java.util.Arrays;

public class Ex07 {
    public int arrLength(int[] arr) {
        //더 이상 쪼갤 수 없는 경우
        if (arr.length == 0) return 0;

        //쪼갤 수 있는 경우
        return 1 + arrLength(Arrays.copyOfRange(arr, 1, arr.length));

//        int head = 1;
//        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
//        return head + arrLength(tail);
    }
}
