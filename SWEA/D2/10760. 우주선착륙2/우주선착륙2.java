import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), t = 0;
		while (t++ < T) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int [][] arr = new int[N][M];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 상 하 좌 우 좌상 우상 좌하 우하
			int[] dr = {-1, 1, 0, 0, 1, 1, -1, -1};
			int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
			
			int ans = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					
					int r = i;
					int c = j;
					
					int cnt = 0;
					
					for(int d=0; d<8; d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];
						
						if(nr < 0 || nc < 0 || nr >= N || nc >= M) continue;
						
						if(arr[r][c] > arr[nr][nc]) cnt++;
					}
					
					if(cnt >= 4) ans++;
				}
			}
			
			
			System.out.println("#" + t + " " + ans);
		}
	}
}