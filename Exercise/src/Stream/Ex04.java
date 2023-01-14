package Stream;
import java.util.*;

public class Ex04 {
    public long computeCountOfFemaleMember(List<Member> members) {
        /*
        Member 클래스를 이용해 회원의 이름과 성별을 관리하려 한다.
        Member타입의 List를 입력받아, 여성 회원의 수를 리턴하라.
         */

        //list의 요소는 Member 클래스의 인스턴스 객체
        long count = members.stream()
                .filter(m -> m.getGender().equals("Female")) //성별이 여성인 회원만을 필터링
                .count(); //여성 회원의 수
        return count;
    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
