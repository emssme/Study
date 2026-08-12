package D2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class d2_1948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();
			
			LocalDate d1 = LocalDate.of(2026, month1, day1);
			LocalDate d2 = LocalDate.of(2026, month2, day2);
			
			long days = ChronoUnit.DAYS.between(d1, d2) + 1;
			
			System.out.println("#" + test_case + " " + days);
		}
	}
}
