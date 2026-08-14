import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int answer = 0;
			
			if(A > 9 || B > 9) answer = -1;
			else answer = A * B;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
