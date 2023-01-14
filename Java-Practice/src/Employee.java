public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city+ " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Employee e = new Employee(1, "홍길동", address1);
        Employee e2 = new Employee(2, "신짱구", address2);

        e.showInfo();
        e2.showInfo();
    }
}
class Address {
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
