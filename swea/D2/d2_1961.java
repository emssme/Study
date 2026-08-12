package D2;

import java.util.Scanner;

public class d2_1961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			
			int[][] arr = new int[N][N];
			
			// 입력값 배열에 할당
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					// 90도
					sb.append(arr[N-1-j][i]);
				}
				
				sb.append(" ");
				
				for(int j=0; j<N; j++) {
					// 180도
					sb.append(arr[N-1-i][N-1-j]);
				}
				
				sb.append(" ");
				
				for(int j=0; j<N; j++) {
					// 270도
					sb.append(arr[j][N-1-i]);
				}
				
				sb.append("\n");
			}
			
			System.out.println("#" + test_case);

			System.out.print(sb);
		}
	}
}
