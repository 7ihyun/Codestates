package Datastructure;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        int[][] output1 = createMatrix(new int[][]{
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0},
        });

        System.out.println(output1);

        int[][] output2 = createMatrix(new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        });

        System.out.println(output2);
    }
    public static int[][] createMatrix(int[][] edges) {
        //TODO:
        int[][] graph;

        //행렬의 크기를 구함 edges[i][j]
        int edgesLength = 0;

        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if (edgesLength < edges[i][j]) edgesLength = edges[i][j];
            }
        }

        //array의 index는 0부터 시작 -> edgesLength에 1을 더해 초기화
        graph = new int[edgesLength + 1][edgesLength + 1];

        //edge 순회
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            int direction = edges[i][2];
            //방향인 간선
            if(direction == 0) graph[from][to] = 1;

            //무향인 간선
            else if(direction == 1) {
                graph[from][to] = 1;
                graph[to][from] = 1;
            }
        }
        return graph;
    }
}
