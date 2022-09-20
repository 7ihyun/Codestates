package RecursiveFunction;

import java.util.Arrays;

public class Ex06 {
    public int arrProduct(int[] arr) {
        if (arr.length == 0) return 1;

        int start = arr[0];
        int[] end = Arrays.copyOfRange(arr, 1, arr.length);
        return  start * arrProduct(end);
    }
}