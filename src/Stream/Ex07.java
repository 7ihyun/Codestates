package Stream;
import java.util.*;

public class Ex07 {
    public String[] filterName(List<String> names) {
        /*
        String 타입을 요소로 가지는 List를 입력받아 중복을 제거하고 김씨 성을 가진 이름들을 정렬하여 문자열 배열로 리턴
         */
        return names.stream()
                .distinct() //중복 제거
                .filter(n -> n.startsWith("김")) //첫 글자가 "김"인 경우만 필터링
                .sorted() //정렬
                .toArray(String[]::new); //최종 결과
    }
}
