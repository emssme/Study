import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] block = new int[N];
			
			for(int i=0; i<N; i++) {
				block[i] = sc.nextInt();
			}
			
			int highMax = 0;	// 올라가기 최대값
			int lowMax = 0;		// 내려가기 최대값
			int height = 0;		// 높이
			
			// 올라가기
			for(int i=N-1; i>0; i--) {
				height = block[i] - block[i-1];
				if(height > highMax) {
					highMax = height;
				}
			}
			
			// 내려가기
			for(int i=0; i<N-1; i++) {
				height = block[i] - block[i+1];
				if(height > lowMax) {
					lowMax = height;
				} 
			}
			System.out.println("#" + test_case + " " + highMax + " " + lowMax);
		}
	}
}