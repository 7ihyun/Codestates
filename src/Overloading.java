public class Overloading {
    public static void main(String[] args) {
        Shape s = new Shape(); //객체 생성

        //메서드 호출
        s.area();
        s.area(5);
        s.area(10, 10);
        s.area(6.0, 12.0);
    }
}
class Shape { //메서드 오버로딩 (하나의 class 안에 같은 이름의 메서드를 여러 개 정의)
    public void area() {
        System.out.println("넓이");
    }
    public void area(int r) {
        System.out.println("원의 넓이 = " + 3.14 * r * r);
    }
    public void area(int w, int l) {
        System.out.println("직사각형의 넓이 = " + w * l);
    }
    public void area(double b, double h) {
        System.out.println("삼각형의 넓이 = " + 0.5 * b * h);
    }
}

