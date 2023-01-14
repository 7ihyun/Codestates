package Collection;

import java.util.*;

public class Ex06 {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        /*
        ArrayList와 요소, 수정할 위치의 인덱스를 입력받아
        주어진 요소를 ArrayList의 인덱스의 값을 수정하고 해당 ArrayList를 리턴
         */

        if (index < 0 || index > arrayList.size()) return null;

        arrayList.set(index, str); //set() : 값을 변경하는 메서드
        return arrayList;
    }
}
