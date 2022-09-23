package Datastructure;

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = browserStack(actions, start);

        System.out.println(output); // [["A"], ["B"], ["A", "D"]]

        String[] actions2 = new String[]{"B", "-1", "B", "A", "C", "-1", "-1", "D", "-1", "1", "E", "-1", "-1", "1"};
        String start2 = "A";
        ArrayList<Stack> output2 = browserStack(actions2, start2);

        System.out.println(output2); // [["A", "B"], ["D"], ["E"]]
    }
    public static ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        //ToDo :
        current.push(start);
        //향상된 for문 a:b 로 써보기
        for (int i = 0; i < actions.length; i++) {

            //뒤로 가기 버튼을 누른 경우 "-1"
            if (actions[i].equals("-1") && !prevStack.empty()) {

                //현재 페이지를 nextStack 에 보관(push)
                nextStack.push(current.pop());

                //prevStack 에서 가장 나중에 보관된 페이지(top)를 현재 페이지로 가져옴
                String page = prevStack.pop(); //pop() : 가장 최상위(마지막)에 위치한 데이터를 추출하고 스택에서 삭제

                current.push(page);
            }

            //앞으로 가기 버튼을 누른 경우 "1" && nextStack 이 빈 값이 아닐 때
            else if (actions[i].equals("1") && !nextStack.empty()) {
                //nextStack 에서 가장 나중에 보관된 페이지(top)를 가져옴
                String nextPage = nextStack.pop();

                //현재 페이지를 prevStack 에 push
                prevStack.push(current.pop());

                current.push(nextPage);
            }

            //앞으로 가기, 뒤로 가기 버튼이 비활성화 된 경우 스택에 push 하지 않음
            else if(actions[i].equals("1") || actions[i].equals("-1")){}

            //새로운 페이지로 접속한 경우
            else {
                //현재 페이지를 prevStack 에 보관
                prevStack.push(current.pop());

                current.push(actions[i]);

                //nextStack 에 저장된 모든 데이터를 삭제하고 스택 초기화
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);
        return result;
    }
}
