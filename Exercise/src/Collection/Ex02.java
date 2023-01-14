package Collection;

import java.util.*;

public class Ex02 {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        /*
        Integer 타입의 ArrayList와 수를 입력받고, 그 수가 인덱스로 가리키는 ArrayList의 요소를 리턴
         */

        int size = arrayList.size();
        if (index == 0) return null; //빈 ArrayList인 경우, null
        if (index < 0 || index > size)  return null; //index가 ArrayList의 크기를 벗어나는 경우, null

        return arrayList.get(index); //get() : 특정 요소를 읽어오는 메서드
    }
}
