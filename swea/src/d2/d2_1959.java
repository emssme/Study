package d2;

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
			
			//입력 값 배열에 할당.			
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				arrA[i] = a;
			}
			
			for(int j=0; j<M; j++) {
				int b = sc.nextInt();
				arrB[j] = b;
			}
			
			// 짧은 배열, 긴 배열 구분
			if(N < M) {
				arrS = arrA;
				arrL = arrB;
			} else {
				arrS = arrB;
				arrL = arrA;
			}
			
			// 한위치에서의 계산한 의 배열
			int[] tmpArr = new int [arrS.length];
			// 모든 위치에서의 계산한 결과의 합계를 저장한 배열
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
