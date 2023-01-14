import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 1; treeSet.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;

            System.out.println(i + "번째 num = " + num);

            try { Thread.sleep(1000); } catch (Exception e) {} //1초 뒤에 출력

            treeSet.add(num);
        }

        System.out.println("당첨 번호는 : " + treeSet);
    }
}
