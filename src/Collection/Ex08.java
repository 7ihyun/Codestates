import java.util.*;

public class Ex08 {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        /*
        String 타입을 요소로 가지는 ArrayList와 인덱스를 입력받아 ArrayList에 인덱스의 요소를 삭제한 후 해당 요소를 리턴
         */

        if (index < 0 || index > arrayList.size()) return null;

        return arrayList.remove(index);
    }
}
