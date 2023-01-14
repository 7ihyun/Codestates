package Stream;
import java.util.*;

public class Ex05 {
    public double computeAverageOfMaleMember(List<Member> members) {
        /*
        Member 클래스를 이용해 회원의 이름, 성별, 나이까지 관리하려 한다.
        Member 타입을 요소로 가지는 List를 입력받아, 남성 회원들의 평균 나이를 리턴하라.
         */
        double maleAvg = members.stream()
                .filter(m -> m.getGender().equals("Male")) //성별이 남성인 회원만 필터링
                .mapToInt(Member::getAge) //남성 회원들의 나이를 받아옴
                .average() //남성 회원들의 평균 나이
                .orElse(0.0); //orElse는 해당 값이 null이던 아니던 실행
        return maleAvg;
    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
