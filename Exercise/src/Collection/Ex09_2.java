package Collection;

import java.util.ArrayList;

public class Ex09_2 {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        //subLis() 사용
        return arrayList.isEmpty() ? null : new ArrayList<>(arrayList.subList(0, arrayList.size()-1));
    }
}
