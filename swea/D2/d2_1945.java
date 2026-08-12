package D2;

import java.util.Arrays;
import java.util.Scanner;

public class d2_1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] arr = {2, 3, 5, 7, 11};
		
		StringBuilder sb = new StringBuilder();
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] result = new int[arr.length];
			
			for(int i=0; i<arr.length; i++) {
				while(N % arr[i] == 0) {
					N /= arr[i];
					result[i]++;
				}
			}
			sb.append("#").append(test_case);
			for(int idx : result) {
				sb.append(" ").append(idx);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
