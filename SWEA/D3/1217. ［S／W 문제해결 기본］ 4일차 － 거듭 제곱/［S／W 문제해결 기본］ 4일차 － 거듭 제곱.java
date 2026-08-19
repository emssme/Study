import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int test_case = 1; test_case<=10; test_case++) {			
			int n = sc.nextInt();	//테스트 케이스(사용X)
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int answer = 1;
			
			for(int i=0; i<b; i++) {
				answer *= a;
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
