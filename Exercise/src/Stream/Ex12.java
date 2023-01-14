package Stream;
import java.util.*;

public class Ex12 {
    public boolean isHot(int[] temperature) {
        /*
        최고 기온이 30도를 넘은 날이 3일 이상이면 true를, 그렇지 않다면 false를 리턴
        배열의 길이는 7 (일주일)
         */

        if (temperature.length != 7) return false; //입력받은 배열의 길이가 7이 아니면 false

        double Days = Arrays.stream(temperature)
                .filter(temp -> temp >= 30) //30 이상인 요소만 필터링
                .count();
        if (Days >= 3) return true;
        else return false;
    }
}
