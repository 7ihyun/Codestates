package Stream;
import java.util.*;
import java.util.stream.*;

public class Ex11 {
    public List<Integer> makeElementDouble(List<Integer> list) {
        /*
        Integer 타입을 요소로 가지는 List를 입력받아 각 요소에 2를 곱한 새로운 List를 리턴
         */
        return list.stream()
                .map(value -> value * 2) //map으로 요소들의 값을 수정
                .collect(Collectors.toList()); //리스트 형태로 리턴
    }
}
