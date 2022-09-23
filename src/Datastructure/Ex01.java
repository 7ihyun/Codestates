package Datastructure;

import java.util.*;

public class Ex01 {
    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    public void push(Integer data) {
        listStack.add(data); //데이터 추가
    }

    public Integer pop() {
        if(listStack.size() == 0) { //빈 list
            return null;
        }else {
            return listStack.remove(listStack.size()-1); //마지막 데이터 삭제
        }
    }

    public int size() {
        return listStack.size(); //추가된 데이터의 크기
    }

    public Integer peek() {
        if(listStack.size() == 0) {
            return null;
        }else {
            return listStack.get(listStack.size()-1); //마지막 데이터 리턴
        }
    }

    public String show() {
        return listStack.toString();
    }
    public void clear() { listStack.clear(); }
}