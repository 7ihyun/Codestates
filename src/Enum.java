//class Seasons { //사용자 정의 타입 (에러 발생)
//    public static final Seasons Spring = new Seasons();
//    public static final Seasons Summer = new Seasons();
//    public static final Seasons Fall = new Seasons();
//    public static final Seasons Winter = new Seasons();
//}
enum Seasons {Spring, Summer, Fall, Winter}

public class Enum {
    public static void main(String[] args) {
        Seasons seasons = Seasons.Spring;
        switch (seasons) {
            case Spring:
                System.out.println("봄");
                break;
            case Summer:
                System.out.println("여름");
                break;
            case Fall:
                System.out.println("가을");
                break;
            case Winter:
                System.out.println("겨울");
                break;
        }
    }
}
