import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String correct = sc.next();
			String answer = sc.next();
			
			String[] correctArr = correct.split("");
			String[] answerArr = answer.split("");
			
			int correctCnt = 0;
			
			for(int i=0; i<N; i++) {
				if(correctArr[i].equals(answerArr[i])) correctCnt++;
			}
			System.out.println("#" + test_case + " " + correctCnt);
		}
	}
}
