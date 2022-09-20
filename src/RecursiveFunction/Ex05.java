package RecursiveFunction;

import java.util.Arrays;

public class Ex05 {
    public int arrSum(int[] arr) {
        if (arr.length == 0) return 0;

        int start = arr[0]; //첫번째 요소
        int[] end = Arrays.copyOfRange(arr, 1, arr.length); //첫번째 요소를 제외한 나머지 요소
        return  start + arrSum(end);
    }
}