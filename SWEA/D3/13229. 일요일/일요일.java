import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUM"};
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int answer = 0;
			
			for(int i=0; i<day.length; i++) {
				if(str.equals(day[i])) {
					answer = 6 - i;
				}
			}
			
			if(answer == 0 )answer = 7;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
