package Stream;
import java.util.*;
import java.util.stream.*;

public class Ex10 {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        /*
        String 타입을 요소로 가지는 List 두 개를 입력받아, 스트림을 이용해 하나의 List로 합친 결과를 리턴
         */
        Stream<String> stream1 = list1.stream(); //list1 스트림 생성
        Stream<String> stream2 = list2.stream(); //list2 스트림 생성

        Stream<String> concat = Stream.concat(stream1, stream2); //두 개의 스트림을 합치기 (concat)

        return concat.collect(Collectors.toList()); //합친 스트림을 list 형태로 변환하여 리턴
    }
}
