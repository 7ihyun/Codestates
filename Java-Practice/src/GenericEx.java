class Plant {
    public void size() {
        System.out.println("");
    }
}
class MapleTree extends Plant {
    public void size() {
        System.out.println("Big");
    }
}
class Sunflower extends Plant {
    public void size() {
        System.out.println("Medium");
    }
}
class Cosmos extends Plant {
    public void size() {
        System.out.println("Small");
    }
}

//제네릭 클래스 정의 (제한된 제네릭 클래스)
class PlantList <T extends Plant> { //Plant 클래스를 상속받음
    /*Plant 클래스를 상속받는 동시에 Sunflower 인터페이스를 구현한 클래스만 타입으로 지정하려면 &를 사용
    class PlantList <T extends Plant & Sunflower> */
    private T item;
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

public class GenericEx {
    public static void main(String[] args) {
        //인스턴스화
        PlantList<Plant> plantList = new PlantList<>();
        PlantList<Sunflower> sunflowerPlantList = new PlantList<>();
    }
}
