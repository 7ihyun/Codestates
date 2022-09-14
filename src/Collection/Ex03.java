import java.util.*;
public class Ex03 {
    public String getLastElement(ArrayList<String> arrayList) {
        /*
        문자열타입의 ArrayList를 입력받아 마지막 요소를 리턴
         */

        int size = arrayList.size();
        if (size == 0) return null; //빈 ArrayList인 경우, null

        return arrayList.get(size-1); //마지막 요소 리턴
    }
}
