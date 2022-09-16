package Stream;
import java.util.*;

public class Ex06 {
    public String[] makeUniqueNameArray(List<String> names) {
        /*
        String 타입을 요소로 가지는 List를 입력받아 중복을 제거하고 정렬한 후 String 타입을 요소로 갖는 배열로 리턴
        사전식 순서로 정렬
         */
        return names.stream()
                .distinct() //중복 제거
                .sorted() //정렬
                .toArray(String[]::new); //Stream을 배열로 변환
    }
}
