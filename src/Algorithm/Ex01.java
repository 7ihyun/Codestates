package Algorithm;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        int output1 = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output1); // 3

        int output2 = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output2); // 4
    }
    public static int movingStuff(int[] stuff, int limit) {
        // TODO:
        // 한 번에 2개를 옮길 수 있는 횟수
        int count = 0;
        // 짐을 무게 순으로 정렬
        Arrays.sort(stuff);
        // 가장 가벼운 짐의 인덱스
        int light = 0;
        // 가장 무거운 짐의 인덱스
        int heavy = stuff.length-1;

        while (light < heavy) {
            // 가장 가벼운 짐과 무거운 짐의 합이 limit 보다 작거나 같으면 2개를 한 번에 나를 수 있음
            if (stuff[light] + stuff[heavy] <= limit) {
                // 다음 짐을 확인하기 위해 인덱스를 바꿔줌
                light++;
                heavy--;
                // 한 번에 2개를 옮길 수 있는 횟수를 + 1
                count++;
            }
            // 짐들의 합이 limit를 초과하는 경우 한 번에 하나만 옮길 수 있음
            // 가장 무거운 짐의 인덱스만 옮김
            else heavy--;
        }
        //전체 짐의 개수에서 한 번에 2개를 나를 수 있는 경우를 빼서 필요한 박스의 개수를 구함
        return stuff.length - count;
    }
}
