package RecursiveFunction;

public class Ex02 {
    public boolean isOdd(int num) {
        if (num < 0) return isOdd(-num); //음수일 경우 양수로 변경 (처음 한 번만 실행)

        //더 이상 쪼갤 수 없는 경우
        if (num == 0) return false; //num = 0 이면 짝수
        if (num == 1) return true; //num = 1 이면 홀수

        //쪼갤 수 있는 경우

        /* &, /연산자 사용 금지 */
        return isOdd(num - 2); //2씩 빼면서 홀수인지 구분
    }
}
