package Stream;
import java.util.*;

public class Ex02 {
    public double computeAverageOfNumbers(List<Integer> list) {
        /*
        Integer 타입을 요소로 가지는 List를 입력받아 요소의 평균을 리턴
         */
        if (list.size() == 0) return 0; //빈 list의 경우 0을 리턴

        //double 타입을 리턴
        //list의 총 합
        double total = list.stream()
                .mapToDouble(m -> m) //소수점 이하까지 구할 수 있도록 DoubleStream으로 변환
                .sum();
        //list의 총 합을 list 크기로 나눔
        return total / list.size();
    }
}
