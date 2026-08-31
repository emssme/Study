import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			
			for(int i=0; i<5; i++) {
				int score = sc.nextInt();
				
				if(score < 40) score = 40;
				
				sum += score;
			}
			
			System.out.println("#" + test_case + " " + (Integer) sum / 5);
		}
	}
}
