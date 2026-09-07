import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer; 

public class Solution {
    static int[] left, right;

    public static void main(String[] args) throws IOException{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();   // 출력도 모아서 한 번에

        st.nextToken(); int T = (int) st.nval;
        for(int tc = 1; tc <= T; tc++) {
            st.nextToken(); int V = (int) st.nval;
            st.nextToken(); int E = (int) st.nval;
            st.nextToken(); int a = (int) st.nval;
            st.nextToken(); int b = (int) st.nval;

            int [] parent = new int[V+1];
            left = new int[V+1];
            right = new int[V+1];
            // 조상 체크 배열
            boolean[] visited = new boolean[V+1];

            for(int i=0; i<E; i++) {
                st.nextToken(); int p = (int) st.nval;   // 부모
                st.nextToken(); int c = (int) st.nval;   // 자식

                parent[c] = p;
                
                if (left[p] == 0) {
                    // 왼쪽 자식 비었을 때 왼쪽에 넣기
                    left[p] = c;
                } else {
                    // 그렇지 않으면 오른쪽에 넣기
                    right[p] = c;
                }
            }

            // 아래서부터 올라가면서 조상찾기
            while (a != 0) {
                // 체크한 조상 true로 변경
                visited[a] = true;
                a = parent[a];
            }

            // a로 탐색하면서 visited가 true인 조상이 있으면 공통조상
            while(!visited[b]) {
                b = parent[b];
            }

            // 공통조상(b) 서브트리의 노드 개수 세기
            int sub = countNodes(b);

            sb.append("#").append(tc).append(" ").append(b).append(" ").append(sub).append("\n");
        }
        System.out.println(sb);
    }

    // b를 루트로 하는 서브트리의 노드 개수
    static int countNodes(int node) {
        if (node == 0) return 0;
        return 1 
        + countNodes(left[node])    // 왼쪽 서브트리
        + countNodes(right[node]);  // 오른쪽 서브트리
    }
}
