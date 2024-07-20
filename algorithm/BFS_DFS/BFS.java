package algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    // BFS 메소드
    static void bfs(int start, ArrayList<Integer>[] graph, boolean[] visited) {
        // 큐를 생성하여 BFS를 수행할 노드를 저장
        Queue<Integer> q = new LinkedList<>();
        
        // 시작 노드를 큐에 추가하고 방문 처리
        q.offer(start);
        visited[start] = true;
        
        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 큐의 맨 앞에 있는 요소를 제거하고 반환
            int node = q.poll();
            
            // 현재 노드의 모든 이웃 노드를 탐색
            for (int neighbor : graph[node]) {
                // 이웃 노드를 방문하지 않았다면
                if (!visited[neighbor]) {
                    // 방문 처리하고 큐에 추가
                    visited[neighbor] = true;
                    q.offer(neighbor);
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
        // 각 노드는 이웃 노드들을 저장하기 위해 ArrayList 배열을 갖고 있음
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>(); // 각 노드에 빈 리스트 추가
        }
        
        // 간선 정보 입력 받기
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // 간선의 한쪽 끝 노드
            int v = sc.nextInt(); // 간선의 다른 쪽 끝 노드
            // 양방향 간선이므로 양쪽에 추가
            graph[u].add(v); 
            graph[v].add(u); // 무방향 그래프일 경우
        }
        
        // 방문 배열 초기화
        boolean[] visited = new boolean[n];
        
        // 시작 노드 입력 받기
        int start = sc.nextInt();
        
        // BFS 수행
        bfs(start, graph, visited);
        
        // 스캐너 종료
        sc.close();
    }
}