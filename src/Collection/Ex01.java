package Collection;

import java.util.*;

public class Ex01 {
    public ArrayList<Integer> makeArrayList() {
        /*
        ArrayList를 선언하고 1부터 5까지 담은 뒤 리턴
         */

        ArrayList<Integer> arrayList = new ArrayList<>(); //ArrayList 선언

        arrayList.add(1); //add() : 값을 추가하는 메서드
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        return arrayList;
    }
}
