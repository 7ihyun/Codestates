package Collection;

import java.util.*;

public class Ex21 {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        /*
        HashMap, key, 인덱스를 입력받아 주어진 키에 해당하는 값이 List인 경우, 수가 가리키는 인덱스에 해당하는 요소를 리턴
         */

        //주어진 수가 List의 범위를 벗어나지 않는 경우에만 리턴, 그 외의 경우엔 null
        if (!hashMap.containsKey(key)) {
            return null;
        }

        List<String> valueList = hashMap.get(key);

        if (index < 0 || index >= valueList.size()) {
            return null;
        }

        return valueList.get(index);
    }
}
