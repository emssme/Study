import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] arr = new int[10];
			
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 자리 수 합계
			int sumArr[] = new int[10];
			
			for(int i=0; i<10; i++) {
				int sum = 0;
				int num = arr[i];
				while(num > 0) {
					sum += num % 10;
					num /= 10;
				}
				sumArr[i] = sum;
			}
			// 최대값
			int max = sumArr[0];
			for(int i=0; i<sumArr.length; i++) {
				if(sumArr[i] > max) max = sumArr[i];
			}
			
			// 최소값
			int min = sumArr[0];
			for(int i=0; i<sumArr.length; i++) {
				if(sumArr[i] < min) min = sumArr[i];
			}
			
			System.out.println("#" + test_case + " " + max + " " + min);
		}
	}
}