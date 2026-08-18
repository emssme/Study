import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String str = sc.nextLine();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					sb.append(c);
				}
			}
			System.out.println("#" + test_case + " " + sb);
		}
	}
}
