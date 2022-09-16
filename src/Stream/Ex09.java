package Stream;
import java.util.*;

public class Ex09 {
    public int findLongestLength(String[] strArr) {
        /*
        String 타입을 요소로 가지는 배열을 입력받아, 가장 길이가 긴 문자열 요소의 길이를 리턴
         */
        if (strArr.length == 0) { //빈 배열을 입력받은 경우 0
            return 0;
        }
        return Arrays.stream(strArr)
                .mapToInt(String::length) //문자열 요소의 길이
                .max() //가장 긴 길이
                .getAsInt();
    }
}
