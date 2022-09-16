package Stream;
import java.util.*;
import java.util.stream.*;

public class Ex13 {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        /*
        남성 회원과 여성 회원의 이름이 적힌 List가 있다.
        그 중 특정 성씨를 가진 사람의 명단이 필요하다.
        중복된 이름은 제거하고 특정 성씨를 가진 회원들의 이름을 정렬한 후 List로 리턴하라.
         */

        Stream<String> maleStream = male.stream(); //male 스트림 생성
        Stream<String> femaleStream = female.stream(); //female 스트림 생성

        Stream<String> concat = Stream.concat(maleStream, femaleStream); //두 개의 스트림을 합치기

        return concat.distinct() //중복 제거
                .filter(person -> person.startsWith(lastName)) //전달받은 성씨로 시작하는 이름 필터링
                .sorted() //정렬
                .collect(Collectors.toList()); //리스트 형태로 최종 연산
    }
}
