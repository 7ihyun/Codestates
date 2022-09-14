import java.util.*;

public class Ex07 {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        /*
        Integer 타입을 요소로 가지는 ArrayList를 입력받아
        ArrayList의 첫번째 요소를 삭제하고, 삭제된 해당 요소를 리턴
         */

        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList.remove(0); //remove() : 전달된 위치의 값을 삭제
    }
}
