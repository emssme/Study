package D2;

import java.util.Arrays;
import java.util.Scanner;

public class d2_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arrA = new int[N];
			int[] arrB = new int[M];
			int[] arrS, arrL;
			
			//�Է� �� �迭�� �Ҵ�.			
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				arrA[i] = a;
			}
			
			for(int j=0; j<M; j++) {
				int b = sc.nextInt();
				arrB[j] = b;
			}
			
			// ª�� �迭, �� �迭 ����
			if(N < M) {
				arrS = arrA;
				arrL = arrB;
			} else {
				arrS = arrB;
				arrL = arrA;
			}
			
			// ����ġ������ ����� �� �迭
			int[] tmpArr = new int [arrS.length];
			// ��� ��ġ������ ����� ����� �հ踦 ������ �迭
			int[] sumArr = new int [arrL.length - arrS.length + 1];
			
			for(int i=0; i<=arrL.length - arrS.length; i++) {
			    for(int j=0; j<arrS.length; j++) {
			        tmpArr[j] = arrL[i+j] * arrS[j];
			    }
			    sumArr[i] = Arrays.stream(tmpArr).sum();
			}
			
			System.out.println("#" + test_case + " " + Arrays.stream(sumArr).max().getAsInt());
		}
	}
}
