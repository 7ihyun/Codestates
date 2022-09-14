import java.util.*;

public class Ex22 {
    public boolean isMember(HashMap<String, String> member, String username, String password) {
        /*
        회원 정보(username, password)가 저장되어있는 HashMap이 있다.
        username과 password를 입력받아 HashMap에 저장된 회원정보와 일치하는지 확인하려 한다.
        입력받은 username과 password를 이용해 회원이 맞는지 여부를 리턴하라.
         */

        //전달받은 HashMap에 일치하는 username-password 쌍이 있는지 확인
        if (!member.containsKey(username)) { //username-password 쌍이 없다면 false
            return false;
        }

        return member.get(username).equals(password);
    }
}
