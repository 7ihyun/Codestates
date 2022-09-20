package RecursiveFunction;

import java.util.Arrays;

public class Ex08 {
    public int[] drop(int num, int[] arr) {
        if (num == 0 || arr.length == 0) return arr;

        return drop(num -1, Arrays.copyOfRange(arr, 1, arr.length));
    }
}
