package Collection;

import java.util.*;

public class Ex24 {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        /*
        문자열을 입력받아 문자열을 구성하는 각 문자(letter)를 키로 갖는 HashMap을 리턴
        각 키의 값은 해당 문자가 문자열에서 등장하는 횟수를 의미하는 int 타입의 값
         */

        if (str.isEmpty()) {
            return null;
        }

        //hashMap 정의
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //str 순회
        // 각 문자가 hashMap에 존재하는지 확인
        // (문자가 hashMap에 존재하면 +1, 존재하지 않으면 새로은 entry 객체 생성)

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (hashMap.containsKey(character)) {
                int value = hashMap.get(character);
                hashMap.put(character, value + 1);
            } //if (hashMap.containsKey(character)) hashMap.put(character, hashMap.get(character) + 1);
            else hashMap.put(character, 1);
        }

        return hashMap;
    }
}
