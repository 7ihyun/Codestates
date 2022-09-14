import java.util.*;

public class Ex12 {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        /*
        Integer 타입의 ArrayList를 입력받아 모든 요소를 더한 값을 리턴
         */

        if (arrayList.size() == 0) return 0;

        int sum = 0;
        Iterator<Integer> iterator = arrayList.iterator(); //Iterator를 이용해 요소를 순회

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            sum += next;
        }

        return sum;
    }
}
