package d2;

import java.util.Scanner;

public class d2_21425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			
			int cnt = 0;
			while(A<=N && B<=N) {
	            if (A < B) {
	                A += B;
	            } else {
	                B += A;
	            }
	            cnt++;
			}
			
			System.out.println(cnt);
		}
	}
}
