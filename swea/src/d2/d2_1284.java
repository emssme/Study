package d2;

import java.util.Scanner;

/*
[A]
1리터 당 P원
[B]
R리터 이하 -> 기본요금 Q
R리터 초과 -> 기본요금 Q + 초과량에 대해 1리터 당 S원

종민 -> W리터 사용
 */
public class d2_1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			int B = 0;
			int min;
			
			int A = P * W;
			
			if(W <= R) {
				B = Q;
			} else {
				B = Q + ((W - R) * S);
			}
			
			min = Math.min(A, B);
			
			System.out.println("#" + test_case + " " + min);
		}
	}
}
