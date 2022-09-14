import java.util.*;
public class Ex09 {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        /*
        ArrayList와 요소를 입력받아, 마지막 요소가 제거된 새로운 ArrayList을 리턴
         */

        int size = arrayList.size();
        if (size == 0) return null;

        //새로운 ArrayList 정의
        ArrayList<Integer> newArrayList = new ArrayList<>(arrayList);

        newArrayList.remove(size - 1);
        return newArrayList;
    }
}
