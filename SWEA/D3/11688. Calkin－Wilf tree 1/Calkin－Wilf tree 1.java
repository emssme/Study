import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String direction = sc.next();
			int a = 1;
			int b = 1;
			
			for(int i=0; i<direction.length(); i++) {
				if(direction.charAt(i) == 'L') {
					a = a;
					b = a+b;
				} else if(direction.charAt(i) == 'R') {
					a = a + b;
					b = b;
				}
			}
			System.out.println("#" + test_case + " " + a + " " + b);
		}
	}
}
