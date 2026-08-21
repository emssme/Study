import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			int x = 0;
			int y = 0;
			
			int answer = 0;
			
			for(int i=-N; i<=N; i++) {
				x = i;
				
				for(int j=-N; j<=N; j++) {
					y = j;
					
					double squareX = Math.pow(x, 2);
					double squareY = Math.pow(y, 2);
					
					if(squareX + squareY <= Math.pow(N, 2)) {
						answer++;
					}
				}
			}
			System.out.println("#" + test_case + " "  + (Integer) answer);
		}
	}
}
