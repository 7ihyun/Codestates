import java.util.*;
public class Ex05 {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        /*
        Integer 타입을 요소로 가지는 ArrayList와 추가할 위치의 인덱스, 정수를 입력받아
        주어진 요소를 ArrayList의 인덱스에 추가하고 해당 ArrayList를 리턴
         */

        if (index < 0 || index > arrayList.size()) { //index가 ArrayList의 크기를 벗어나는 경우, null
            return null;
        }
        arrayList.add(index, element); //기존 ArrayList에 요소가 추가된 상태
        return arrayList;
    }
}
