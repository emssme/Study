import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case<=T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int cnt = 0;
			
			for(int i=a; i<=b; i++) {
				String str = String.valueOf(i);
				String reverse = new StringBuilder(str).reverse().toString();
				
				// 제곱근 반환
				double palindrome = Math.sqrt(i);
				
				if((palindrome % 1 == 0) && str.equals(reverse)) {
					String str2 = String.valueOf((int) palindrome);
					String reverse2 = new StringBuilder(str2).reverse().toString();
					// 제곱근 팰린드롬 확인
					if(str2.equals(reverse2)) {
						cnt++;
					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
