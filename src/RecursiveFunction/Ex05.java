package RecursiveFunction;

import java.util.Arrays;

public class Ex05 {
    public int arrSum(int[] arr) {
        //더 이상 쪼갤 수 없는 경우
        if (arr.length == 0) return 0;

        //쪼갤 수 있는 경우
        int head = arr[0]; //첫번째 요소
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length); //첫번째 요소를 제외한 나머지 요소
        return  head + arrSum(tail);
    }
}