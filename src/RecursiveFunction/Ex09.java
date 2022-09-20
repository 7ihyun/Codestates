package RecursiveFunction;

import java.util.Arrays;

public class Ex09 {
    public int[] take(int num, int[] arr) {
        //base case : 문제를 더 이상 쪼갤 수 없는 경우
        if (arr.length == 0 || num == 0) return new int[]{};

        //recursive case : 그렇지 않은 경우
        int[] head = Arrays.copyOfRange(arr, 0, 1);
        int[] tail = take(num-1, Arrays.copyOfRange(arr, 1, arr.length)); //호출될 때마다 num-1

        int[] dest = new int[head.length +tail.length];  //head와 tail의 새로운 길이를 합친 새로운 배열 생성
        //head와 tail 두 배열의 요소를 dest 배열에 복사
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);

        return dest;

        /*
     public class Solution {
       //선택한 요소의 갯수를 체크하는 count 변수를 선언, 0으로 초기화합니다.
       int count = 0;
        public int[] take(int num, int[] arr){
         //edge Case
         //선택할 요소의 갯수(num)가 배열의 전체 요소의 갯수보다 많은 경우, 입력된 배열을 반환합니다.
         if(num >= arr.length) {
           return arr;
         }
         //선택할 요소의 갯수(num)가 0인 경우, 입력된 배열의 요소가 아무것도 없는 경우에는 빈 배열을 반환합니다.
         if(num == 0 || arr.length == 0) {
           return new int[]{};
         }

         //base Case : 더 이상 쪼개어 생각할 수 없는 경우
         //선택한 요소의 갯수(count)가 최종적으로 선택해야 하는 요소의 갯수(num)과 같을때 입력된 배열을 반환합니다.
         if(count == num) {
           return arr;
         }
         //맨 뒷부분의 요소를 제외한 나머지 배열을 tail이라는 변수에 할당합니다.
         int[] tail = Arrays.copyOfRange(arr, 0, arr.length -1);

         //한가지 요소를 제외했기 때문에, 선택할 요소의 갯수의 수를 1 증가합니다.
         count++;

         //제외한 배열을 포함하여 다시 재귀함수를 실행합니다.
         return take(num, tail);
        }
     */
    }
}
