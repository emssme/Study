import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N][N];
						
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int answer = 0;
			
			// 가로
			for(int i=0; i<N; i++) {
				int cnt = 0;
				for(int j=0; j<N; j++) {
					if(arr[i][j] == 1) {
						cnt++; 
					} else {
						if(cnt == K) answer++;
						cnt = 0;
					}
				}
				if(cnt == K) answer ++;
			}
			
			// 세로
			for(int j=0; j<N; j++) {
				int cnt =0;
				for(int i=0; i<N; i++) {
					if(arr[i][j] ==1) {
						cnt++;
					} else {
						if(cnt == K) answer++;
						cnt = 0;
					}
				}
				if(cnt == K) answer++;
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}