package d2;

import java.util.Scanner;

public class d2_1976 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int hour = 0;
			int minute = 0;

			hour = h1 + h2;
			minute = m1 + m2;
			
			if(minute >= 60) {
				hour += 1;
				minute -= 60;
			}
			
			if(hour > 12) {
				hour -= 12;
			}
			
			System.out.println("#" + test_case + " " + hour + " " + minute);
		}
	}
}
