package Collection;

import java.util.*;

public class Ex18_2 {
    public int addOddValues(HashMap<Character, Integer> hashMap) {

        int sum = 0;

        Collection<Integer> value = hashMap.values();

        Iterator<Integer> iterator = value.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) sum += num;
        }
        return sum;
    }
}
