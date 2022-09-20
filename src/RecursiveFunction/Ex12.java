package RecursiveFunction;

import java.util.Arrays;

public class Ex12 {
    public int[] reverseArr(int[] arr) {
        //base case : 문제를 더 이상 쪼갤 수 없는 경우
        if (arr.length == 0) return new int[]{};

        //recursive case : 그렇지 않은 경우
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] dest = new int[head.length + tail.length];

        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);

        return dest;
    }
}