package RecursiveFunction;

import java.util.Arrays;

public class Ex11 {
    public boolean or(boolean[] arr) {
        //더 이상 쪼갤 수 없는 경우
        if (arr.length == 0) return false;

        //쪼갤 수 있는 경우
        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

//        if (head || tail) return true;
//        return false;
        return (head || or(tail));
    }
}
/*
contains() 는 하나하나 확인하며 순회하기 때문에 연산이 많은 경우에는 지양
 */