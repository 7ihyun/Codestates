package Stream;
import java.util.*;

public class Ex01 {
    public int computeSumOfAllElements(List<Integer> list){
        /*
        Integer 타입을 요소로 가지는 List를 입력받아 요소의 총 합을 리턴
         */
        if (list.size() == 0) return 0; //빈 list의 경우 0을 리턴

        return list.stream()
                .mapToInt(m -> m) //stream을 IntStream으로 변환
                .sum(); //최종 연산
    }
}
