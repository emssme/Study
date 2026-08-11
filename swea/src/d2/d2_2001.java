package d2;

import java.util.Scanner;

public class d2_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();	// 파리
			int M = sc.nextInt();	// 파리채
			
			int[][] flyArr = new int[N][N];
			
			// 2차원 배열에 입력된 숫자 할당.
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					flyArr[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			for(int i=0; i<=N-M; i++) {	// 파리채 행 시작 위치
				for(int j=0; j<=N-M; j++) {	// 파리채 열 시작 위치
					int sum = 0; 
					for(int di = 0; di<M; di++) {
						for(int dj = 0; dj<M; dj++) {
							sum += flyArr[i + di][j + dj];
						}
					}
			        
			        max = Math.max(max, sum);
				}
			}
			System.out.println("#" + test_case + " " + max);
		}	
	}
}
