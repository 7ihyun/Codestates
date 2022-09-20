package RecursiveFunction;

import java.util.Arrays;

public class Ex10 {
    public boolean and(boolean[] arr) {
        //더 이상 쪼갤 수 없는 경우
        if (arr.length == 0) return true;

        //쪼갤 수 있는 경우
        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

//        if (!head || !tail) return false;
//        return  true;

        return (head && and(tail));
    }
}
