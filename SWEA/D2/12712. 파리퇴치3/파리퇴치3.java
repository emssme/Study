import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] flies = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					flies[i][j] = sc.nextInt();
				}
			}
			
			// 상, 하, 좌, 우
			int[] dr1 = {-1, 1, 0, 0};
			int[] dc1 = {0, 0, -1, 1};
			
			// 좌상, 우상, 우하, 좌하
			int[] dr2 = {-1, -1, 1, 1};
			int[] dc2 = {-1, 1, 1, -1};
			
			int max = Integer.MIN_VALUE;
			
			// 모든 칸을 중심으로 계산
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					
					int sum1 = flies[r][c];
					int sum2 = flies[r][c];
					
					// +
					for(int i=0; i<4; i++) {
						int nr = r;
						int nc = c;
						
						for(int j=1; j<M; j++) {
							nr += dr1[i];
							nc += dc1[i];
							
							if(nr < 0 || nr >= N || nc < 0 || nc >= N) break;
							sum1 += flies[nr][nc];
							
						}
					}
					
					// X
					for(int i=0; i<4; i++) {
						int nr = r;
						int nc = c;
						
						for(int j=1; j<M; j++) {
							nr += dr2[i];
							nc += dc2[i];
							
							if(nr < 0 || nr >= N || nc < 0 || nc >= N) break;
							sum2 += flies[nr][nc];
							
						}
					}
					
					// 최대값
					max = Math.max(max, Math.max(sum1, sum2));
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}
}