package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class Ex03 {
    public List<Integer> filterOddNumbers(List<Integer> list){
        /*
        Integer 타입을 요소로 가지는 List를 입력받이 짝수 요소만 추출한 List를 리턴
         */
        //반목문 사용 금지
        return list.stream()
                .filter(m -> m % 2 == 0) //요소를 순회하며 짝수인지 검사
                .collect(Collectors.toList()); //Stream을 List 형태로 변환
    }
}
