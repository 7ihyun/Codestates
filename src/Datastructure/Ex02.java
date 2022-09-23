package Datastructure;

import java.util.*;

public class Ex02 {
    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    public void add(Integer data) {
        listQueue.add(data); //데이터 추가
    }

    public Integer poll() {
        if(listQueue.size()==0) { //빈 큐
            return null;
        }else {
            return listQueue.remove(0); //가장 먼저 추가된 데이터 삭제
        }
    }

    public int size() {
        return listQueue.size(); //추가된 데이터의 크기
    }

    public Integer peek() {
        if(listQueue.size()==0) {
            return null;
        }else {
            return listQueue.get(0); //가장 먼저 추가된 데이터 리턴
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}
