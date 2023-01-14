package Collection;

import java.util.*;
public class Ex18 {
    public int addOddValues(HashMap<Character, Integer> hashMap) {
        /*
        <Character, Integer> 타입을 요소로 가지는 HashMap을 입력받아 짝수 값(Value) 끼리 모두 더한 값을 리턴
         */

        int sum = 0;
        //keySet() 메서드
        //hashMap에 저장되어 있는 key를 반환하여 get() 메서드로 key에 대응하는 value를 가지고 온다.
        for (Character key : hashMap.keySet()) {
            Integer value = hashMap.get(key);

            if (value % 2 == 0) { //짝수들의 총 합
                sum += value;
            }
        }
        return sum;
    }
}