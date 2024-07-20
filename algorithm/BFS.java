package algorithm;

import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static void bfs(int start, int[][] graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);

        // 시작 노드 방문 처리
        visited[start] = true;

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 큐의 맨 앞에 있는 요소를 제거하고 반환
            int node = q.poll();

            for(int i=0; i<graph[node].length; i++){
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 노드와 간선의 개수 입력 받기
        int n = sc.nextInt(); // 노드의 개수
        int m = sc.nextInt(); // 간선의 개수

        // 그래프 초기화
        int[][] graph = new int[n][n];

        // 간선 정보 입력 받기
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1; // 무방향 그래프일 경우
        }

        // 방문 배열 초기화
        boolean[] visited = new boolean[n];

        // 시작 노드 입력 받기
        int start = sc.nextInt();

        // BFS 수행
        bfs(start, graph, visited);

        sc.close();
    }
}
