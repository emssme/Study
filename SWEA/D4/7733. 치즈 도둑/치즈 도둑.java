import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int N;
	static int[][] cheese;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), t = 0;
		while (t++ < T) {
			
			N = sc.nextInt();
			cheese = new int[N][N];
			
			int max = 0;	// 1이상이라서 1이하의 값으로 초기화
			

			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					cheese[i][j] = sc.nextInt();
					max = Math.max(max,  cheese[i][j]);
				}
			}
			

			int ans = 1;
			
			
			for(int day=1; day < max; day++) {
				boolean[][] eat = new boolean[N][N];

				//해당 day날짜에 치즈를 전부 먹었다.
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						if(cheese[i][j] <= day) {
							eat[i][j] = true;
						}
					}
				}
				
				int cnt = 0; // day의 치즈 덩어리 수
				// 좌표값을 저장
				Queue<int[]> q = new ArrayDeque<>();
				
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						// 행 우선 순회 방식으로 돌면서 남은 치즈 덩어리 개수를 카운팅
						if(eat[i][j]) continue;
						
						// 방문 체크가 되지 않았다면 덩어리를 카운팅한다.
						q.add(new int[] {i, j});	// 시작위치
						eat[i][j] = true;	// 방문 체크
						
						cnt++;
						
						while(!q.isEmpty()) {
							int[] curr = q.poll();
							
							// 덩어리는 4방향인접이면 한 덩어리로 간주. +모양
							for(int d=0; d<4; d++) {
								int nr = curr[0] + dr[d];
								int nc = curr[1] + dc[d];
								
								// 1. 범위 체크 2. eat체크
								if(nr < 0 || nr >= N || nc < 0 || nc >=N || eat[nr][nc]) continue;
								
								q.add(new int[] {nr, nc});
								eat[nr][nc] = true;
							}
						}
					}
				}
				ans = Math.max(cnt, ans);
			}
			System.out.println("#" + t + " " + ans);
		}
	}	
}