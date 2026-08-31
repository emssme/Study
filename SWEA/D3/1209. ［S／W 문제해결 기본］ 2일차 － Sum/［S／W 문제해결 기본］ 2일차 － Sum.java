import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int[][] arr = new int[100][100];
			
			int max = 0;
			
			int T = sc.nextInt();
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 각 행의 합
			for(int i=0; i<arr.length; i++) {
				int rSum = 0;
				for(int j=0; j<arr.length; j++) {
					rSum += arr[i][j];
				}
				if(rSum > max) max = rSum;
			}
			
			// 각 열의 합
			for(int j=0; j<arr.length; j++) {
				int cSum = 0;
				for(int i=0; i<arr.length; i++) {
					cSum += arr[i][j];
				}
				
				if(cSum > max) max = cSum;
			}
			
			// 대각선의 합
			int dSum = 0;
			for(int i=0; i<arr.length; i++) {
			    dSum += arr[i][i];
			}
			
			if(dSum > max) max = dSum;

			// 반대 대각선 합
			int rdSum = 0;
			for(int i=0; i<arr.length; i++) {
			    rdSum += arr[i][arr.length - 1 - i];
			}
			
			if(rdSum > max) max = rdSum;
			
			System.out.println("#" + test_case + " " + max);
		}
	}
}
