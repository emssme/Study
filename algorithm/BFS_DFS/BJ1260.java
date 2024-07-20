package algorithm.BFS_DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BJ1260 {
    // 백준 1260 : DFS와 BFS
    // https://www.acmicpc.net/problem/1260

    private static boolean[] visited;
    private static ArrayList<Integer>[] graph;
    private static int V;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 정점의 개수
        int M = scanner.nextInt(); // 간선의 개수
        V = scanner.nextInt(); // 탐색을 시작할 정점 번호

        // 인접 리스트 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // 각 정점의 인접 리스트를 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 수행
        visited = new boolean[N + 1];
        dfs(V, graph, visited);
        System.out.println();

        // BFS 수행
        visited = new boolean[N + 1];
        bfs(V, graph, visited);
        System.out.println();

        scanner.close();
    }

    private static void dfs(int V, ArrayList<Integer>[] graph, boolean[] visited){
        Stack<Integer> stack = new Stack<>();
        // 시작 노드를 스택에 추가
        stack.push(V);

        while (!stack.isEmpty()) {
            // 스택에서 노드를 꺼냄
            int node = stack.pop();

            // 노드를 아직 방문하지 않았다면
            if (!visited[node]) {
                // 노드를 방문 처리
                visited[node] = true;
                System.out.print(V + " "); 

                // 현재 노드의 인접 노드들을 스택에 추가
                for (int i = graph[node].size() - 1; i >= 0; i--) {
                    int adj = graph[node].get(i);

                    // 인접 노드가 방문되지 않았다면 스택에 추가
                    if (!visited[adj]) {
                        stack.push(adj);
                    }
                }
            }
        }
    }

    private static void bfs(int V, ArrayList<Integer>[] graph, boolean[] visited){
        // 큐를 생성하여 BFS를 수행할 노드를 저장
        Queue<Integer> q = new LinkedList<>();
        
        // 시작 노드를 큐에 추가하고 방문 처리
        q.offer(V);
        visited[V] = true;
        
        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 큐의 맨 앞에 있는 요소를 제거하고 반환
            int node = q.poll();
            System.out.print(V + " "); 
            
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
}
