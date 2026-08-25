import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][M];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 총합 배열에 저장
			int[] sumArr = new int[N];
			
			for(int i=0; i<N; i++) {
				// 점수 합
				int sum = 0;
				
				for(int j=0; j<M; j++) {
					if(arr[i][j] == 1) sum++;
				}
				sumArr[i] = sum;
			}
			
			// 1등 찾기
			int max = 0;
			int cnt = 0;
			
			for(int i=0; i<N; i++) {
				if(sumArr[i] >= max) {
					max = sumArr[i];
				}
			}
			
			for(int i=0; i<N; i++) {
				if(sumArr[i] == max) cnt++;
			}
			
			System.out.println("#" + test_case + " " + cnt + " " + max);
		}
	}
}
