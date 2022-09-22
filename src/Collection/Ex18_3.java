package Collection;

import java.util.*;

public class Ex18_3 {
    public int addOddValues(HashMap<Character, Integer> hashMap) {

        int sum = 0;

        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();

        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next().getValue();
            if (num % 2 == 0) sum += num;
        }
        return  sum;
    }
}
