//제너릭 메서드
class Basket <T> { //1
    private T item;

    public <T> void add(T element) { //2
        System.out.println(item.equals("바구니"));
    }
    /*
    * 메서드 타입 매개변수는 static 메서드에서 선언 가능
    static <T> int setPrice(T element) {
        System.out.println();
    }
    */
}

public class GenericEx2 {
    public static void main(String[] args) {
        Basket<String> basket = new Basket<>(); //1의 T가 String으로 지정
        basket.<Integer>add(10); //2의 T가 Integer로 지정
        //basket.add(10); //타입 지정 생략 가능
    }
}
