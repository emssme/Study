import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int cnt = 0;
			
			// 위 -> 아래 교착상태 확인
			for(int j=0; j<N; j++) {
				
				// 현재 자성 극
				int last = 0;
				for(int i=0; i<N; i++) {
					if(arr[i][j] == 1) {
						// 1이면 계속 이동함
						last = 1;
					} else if(arr[i][j] == 2){
						// 2를 만났을 때 1이면 교착상태
						if(last == 1) {
							cnt++;
							last = 0;
						}
						
					}
				}
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
