package Datastructure;

import java.util.*;

public class Ex12 {
    public static void main(String[] args) {
        int result1 = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {4, 5},
        });
        System.out.println(result1);

        int result2 = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {3, 4},
                {3, 5},
        });
        System.out.println(result2);
    }
    public static int connectedVertices(int[][] edges) {
        // TODO:
        final int[] bigger = {0}; //배열 할당은 불가하나 요소는 수정할 수 있음

        //최대 버텍스 찾기
        Arrays.stream(edges).forEach(data -> {
            int currentBigger = Arrays.stream(data)
                    .boxed()
                    .max(Comparator.comparing(i -> i))
                    .orElse(0);
            if(bigger[0] < currentBigger) bigger[0] = currentBigger;
        });

        //최대 버텍스의 +1만큼 배열 선언 (0부터 시작)
        int[][] adjArray = new int[bigger[0] + 1][bigger[0] + 1];

        //edges 순회하며 간선을 쌍방으로 연결 (무향그래프 = 양방향)
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            adjArray[from][to] = 1;
            adjArray[to][from] = 1;
        }

        //방문한 버텍스를 담을 배열 선언
        boolean[] visited = new boolean[bigger[0] + 1]; //초기값은 false -> visited = [false, false, false, false, false, false]

        int count = 0; //컴포넌트의 개수

        //방문여부
        for(int vertex = 0; vertex < visited.length; vertex++) {
            //방문하지 않은 경우
            if(!visited[vertex]) count++;

            //그래프와 버텍스를 방문했는지 확인
            //bfs 혹은 dfs 사용
//            visited = bfs_array(adjArray, vertex, visited);
            visited = dfs_array(adjArray, vertex, visited);
        }
        return count;
    }
//    public static boolean[] bfs_array(int[][] adjArray, int vertex ,boolean[] visited) {
//        Queue<Integer> queue = new LinkedList<>(); //bfs의 경우 큐 사용
//
//        //시작지점을 큐에 넣고 방문 여부를 변경
//        queue.add(vertex);
//        visited[vertex] = true;
//
//        while (!queue.isEmpty()) { //큐에 더 이상 방문할 요소가 없을 때까지
//            int cur = queue.poll(); //현재 위치를 큐에서 꺼내옴
//
//            //현재 버텍스의 행만 확인
//            for (int i = 0; i < adjArray[cur].length; i++) {
//                //길이 존재하고 아직 방문하지 않은 경우
//                if(adjArray[cur][i] == 1 && !visited[i]) {
//                    queue.add(i); //큐에 해당 버텍스의 위치를 넣음
//                    visited[i] = true; //방문 여부 체크
//                }
//            }
//        }
//        return visited;
//    }

    public static boolean[] dfs_array(int[][] adjArray, int vertex ,boolean[] visited) {
        //현재 버텍스의 방문여부 체크
        visited[vertex] = true;

        //버텍스의 행 순회
        for(int i = 0; i < adjArray.length; i++) {
            //길이 존재하고 방문하지 않은 경우, 재귀를 사용해 이어진 길부터 탐색
            if (adjArray[vertex][i] == 1 && !visited[i]) dfs_array(adjArray, i, visited);
        }
        return visited;
    }
}
