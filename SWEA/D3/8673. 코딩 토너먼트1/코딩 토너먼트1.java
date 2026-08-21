import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int K = sc.nextInt();
			int people = (int) Math.pow(2, K);
			int [] arr = new int[people];
			int sum = 0;
			
			// 베열에 참가자 할당
			for(int i=0; i<people; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 한명 남을 때 까지 반복
			while(people > 1) {
				// 이긴 사람 실력 저장 배열
				int[] winArr = new int[people/2];
				// 실력 차이
				int boring = 0;
				int idx = 0;
				
				for(int i=0; i<people; i+=2) {
					int max = 0;
					if(arr[i] > arr[i+1]) {
						max = arr[i];
						boring = max - arr[i+1];
					} else {
						max = arr[i+1];
						boring = max - arr[i];
					}
					winArr[idx] = max;
					idx++;
					sum = sum + boring;
				}
				arr = winArr;
				
				people /= 2;
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}
