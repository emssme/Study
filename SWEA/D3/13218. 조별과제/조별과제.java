import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			int answer = 0;
			
			answer = N / 3;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
