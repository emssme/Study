package d2;

import java.util.Scanner;

public class d2_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			
			String str = sc.next();
			
			StringBuilder sb = new StringBuilder(str);
			String reverse = sb.reverse().toString();
			
			if(str.equals(reverse)) {
				result = 1;
			} else {
				result = 0;
			}
			
			System.out.println("#" + test_case + " " + result);
		}
	}
}
