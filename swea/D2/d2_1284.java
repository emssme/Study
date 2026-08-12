package D2;

import java.util.Scanner;

/*
[A]
1���� �� P��
[B]
R���� ���� -> �⺻��� Q
R���� �ʰ� -> �⺻��� Q + �ʰ����� ���� 1���� �� S��

���� -> W���� ���
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
