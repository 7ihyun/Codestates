import java.util.*;
public class Ex04 {
    public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        /*
        String 타입을 요소로 가지는 ArrayList와 문자열 요소를 입력받고 주어진 요소를 ArrayList의 맨 뒤에 추가하고 해당 ArrayList를 리턴
         */

        arrayList.add(str); //입력받은 요소를 ArrayList의 맨 뒤에 추가
        return arrayList;
    }
}
