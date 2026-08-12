package D2;

import java.util.Scanner;

public class d2_2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			int[][] pascalTriangle = new int[N][N];
			
			System.out.println("#" + test_case);
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					if(i==j || j==0) {
						pascalTriangle[i][j] = 1;
					} else {
						pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
					}
					System.out.print(pascalTriangle[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
