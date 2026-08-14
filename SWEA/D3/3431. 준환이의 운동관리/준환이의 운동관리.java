import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			int answer = -1;
			
			if(X < L) {
				answer = L - X;
			} else if (X>=L && X<=U) {
				answer = 0;
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
