import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String correct = sc.next();
			String answer = sc.next();
			
			int correctCnt = 0;
			
			for(int i=0; i<N; i++) {
				if(correct.charAt(i) == answer.charAt(i)) correctCnt++;
			}
			System.out.println("#" + test_case + " " + correctCnt);
		}
	}
}
