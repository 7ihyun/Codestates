package RecursiveFunction;

import java.util.Arrays;

public class Ex07 {
    public int arrLength(int[] arr) {
        if (arr.length == 0) return 0;
        return 1 + arrLength(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
