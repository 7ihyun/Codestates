class Pets {
    public void crying() {
        System.out.println("");
    }
}
class Cats extends Pets {
    public void crying() {
        System.out.println("야옹");
    }
}
class Dogs extends Pets {
    public void crying() {
        System.out.println("멍멍");
    }
}
class Parrot extends Pets {
    public void crying() {
        System.out.println("짹짹");
    }
}

class PetList <T> { //제네릭 클래스 정의
    private T item;
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

public class Generic {
    public static void main(String[] args) {

        PetList<Pets> animalList = new PetList<>(); //인스턴스화
        PetList<Cats> catlList = new PetList<>();
        animalList.setItem(new Cats()); //다형성 적용
    }
}
