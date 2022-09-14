package Collection;

import java.util.*;

public class Ex23 {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        /*
        String 타입을 요소로 가지는 배열과 <String, Integer> 타입을 요소로 가지는 HashMap을 입력받아,
        배열의 각 요소들을 HashMap의 키로 했을 때 그 값을 추출하여 만든 새로운 HashMap을 리턴
         */

        HashMap<String, Integer> newHashMap = new HashMap<>(); //새로운 HashMap 리턴

        //입력받은 HashMap에 존재하지 않는 키는 무시
        //HashMap을 수정하지 않아야 함

        for (String el : arr) {
            if (hashMap.containsKey(el)) {
                newHashMap.put(el, hashMap.get(el));
            }
        }
        return newHashMap;
    }
}
