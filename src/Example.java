public class Example {
    public static void main(String[] args) {
        int primitive = 1;
        Object reference = new Object();
        char letter = 65;

        int intValue = 128;
        byte byteValue = (byte)intValue;

        System.out.println(primitive); //primitive 에 저장된 정수형 1을 출력
        System.out.println(reference); //데이터의 주소값을 출력
        System.out.print(letter); //a의 유니코드 숫자값 : 65

        System.out.println(byteValue);
        //byte형의 표현 범위는 -128~127
        //128을 byte형으로 변환하면 오버플로우가 발생해 -128 출력
    }
}
