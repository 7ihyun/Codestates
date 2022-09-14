package Collection;

import java.util.*;

public class Ex15 {
    public void removeEntry(HashMap<String, Integer> hashMap, String key) {
        /*
        <String, String> 타입을 요소로 가지는 HashMap과 문자열을 입력받아, String 타입을 key로 갖고있는 Entry를 제거
         */

        hashMap.remove(key);
    }
}
