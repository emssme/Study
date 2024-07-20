package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
        // DFS 함수
    static void dfs(int start, List<Integer>[] graph, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        // 시작 노드를 스택에 추가
        stack.push(start);

        while (!stack.isEmpty()) {
            // 스택에서 노드를 꺼냄
            int node = stack.pop();

            // 노드를 아직 방문하지 않았다면
            if (!visited[node]) {
                // 노드를 방문 처리
                visited[node] = true;
                System.out.print(node + " ");

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 노드와 간선의 개수 입력 받기
        int n = sc.nextInt(); // 노드의 개수
        int m = sc.nextInt(); // 간선의 개수

        // 그래프 초기화
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u); // 무향 그래프일 경우
        }

        // 방문 배열 초기화
        boolean[] visited = new boolean[n];

        // 시작 노드 입력 받기
        int start = sc.nextInt();

        // DFS 수행
        dfs(start, graph, visited);

        sc.close();
    }
}
