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

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);

            if (hashMap.containsKey(curChar)) {
                int value = hashMap.get(curChar);
                hashMap.put(curChar, value + 1);
            }
            else {
                hashMap.put(curChar, 1);
            }
        }
        return hashMap;
    }
}
