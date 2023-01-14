//참조변수의 다형성
class Friend {
    public void friendInfo() {
        System.out.println("나는 너의 친구야.");
    }
}
class BoyFriend extends Friend { //Friend 클래스를 상속 받음
    public void friendInfo() {
        System.out.println("나는 너의 남자친구야.");
    }
}
class GirlFriend extends Friend { //Friend 클래스를 상속 받음
    public void friendInfo() {
        System.out.println("나는 너의 여자친구야.");
    }
}
public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend(); //객체 타입과 참조변수 타입의 일치
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new GirlFriend(); //객체 타입과 참조변수 타입의 불일치
        //GirlFriend friend1 = new Friend(); >>하위 클래스 타입으로 상위 클래스 객체 참조 불가

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}
