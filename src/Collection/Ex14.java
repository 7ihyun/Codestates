package Collection;

import java.util.*;

public class Ex14 {
    public HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        /*
        <String, Integer> 타입을 요소로 가지는 HashMap과 Key, Value를 입력받아
        HashMap에 Key-Value 쌍을 추가한 후 새롭게 추가된 요소를 포함한 HashMap을 리턴
         */

        //반복문 사용 금지
        //HashMap에 key-Value 쌍 저장

        hashMap.put(key, value);
        return hashMap;
    }
}
