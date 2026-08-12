package D2;

import java.util.Scanner;

public class d2_1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int ans = 0;
			
			for(int i=1; i<=N; i++) {
				if(i%2 == 0) {
					// ¦��
					ans -= i;
				} else {
					// Ȧ��
					ans += i;
				}
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}
