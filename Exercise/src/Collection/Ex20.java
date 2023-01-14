package Collection;

import java.util.*;

public class Ex20 {
    public boolean isContain(HashMap<String, Integer> hashMap, String key) {
        /*
        <String, Integer> 타입을 요소로 가지는 HashMap과 문자열을 입력받아, HashMap에 문자열을 key로 한 Entry가 있는지의 여부를 리턴
         */

        return hashMap.containsKey(key); //contain() : 인자로 보낸 키가 있으면 true 없으면 false 반환
    }
}
