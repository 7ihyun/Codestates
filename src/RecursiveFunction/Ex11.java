package RecursiveFunction;

import java.util.Arrays;

public class Ex11 {
    public boolean or(boolean[] arr) {
        if (arr.length == 0) return false;

        boolean head = arr[0];
        boolean tail = or(Arrays.copyOfRange(arr, 1, arr.length));

        if (head || tail) return true;
        return false;
    }
}
