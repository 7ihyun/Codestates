package RecursiveFunction;

import java.util.Arrays;

public class Ex10 {
    public boolean and(boolean[] arr) {
        if (arr.length == 0) return true;

        boolean head = arr[0];
        boolean tail = and(Arrays.copyOfRange(arr, 1, arr.length));

        if (!head || !tail) return false;
        return  true;
    }
}
