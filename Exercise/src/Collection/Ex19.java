package Collection;

import java.util.*;

public class Ex19 {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        /*
        한 사람의 firstName, lastName Entry가 저장되어있는 HashMap을 입력 받아,
        fullName 이라는 새 Entry를 HashMap에 저장하고 해당 HashMap을 리턴
         */

        //HashMap에 firstName, lastName이 저장된 것을 이용
        String firstName = hashMap.get("firstName");
        String lastName = hashMap.get("lastName");

        //fullName이라는 key와 알맞은 문자열을 저장해 HashMap을 리턴
        hashMap.put("fullName", firstName + lastName);
        return hashMap;
    }
}
