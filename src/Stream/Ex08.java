package Stream;
import java.util.*;

public class Ex08 {
    public Integer findBiggestNumber(int[] arr) {
        /*
        int 타입을 요소로 가지는 배열을 입력받아 가장 큰 요소를 리턴
         */
        if (arr.length == 0) return null; //빈 배열을 입력받은 경우 null

        return Arrays.stream(arr)
                .max() //최댓값
                .getAsInt(); //Int값을 반환
    }
}
