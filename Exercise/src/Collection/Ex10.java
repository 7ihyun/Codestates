package Collection;

import java.util.*;

public class Ex10 {
    public List<String> arrayToArrayList(String[] arr) {
        /*
        String 타입을 요소로 가지는 배열을 입력받아, String 타입을 요소로 가지는 ArrayList로 변환하여 리턴
         */

        if (arr.length == 0) return null; //빈 배열인 경우, null

        //Arrays.asList() : Arrays의 private 정적 클래스인 ArrayList를 리턴
        return new ArrayList<String>(Arrays.asList(arr));
    }
}
