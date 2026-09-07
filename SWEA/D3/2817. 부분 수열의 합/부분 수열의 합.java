import java.util.Scanner;

public class Solution {
	static int K;
	static int N;
	static int [] arr;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(), t=0;
		
		while (t++ < T) {
			N = sc.nextInt();
			K = sc.nextInt();
			
			arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			cnt = 0;
			
			combination(0, 0);
			
			System.out.println("#" + t + " " + cnt);
			
		}
	}

	static void combination(int idx, int sum) {
		// 모든 원소에 대한 선택이 끝난 경우
		if(idx == N) {
			if(sum == K) {
				cnt++;
			}
			return;
		}
		
		// arr[idx]를 선택하는 경우
		combination(idx + 1, sum + arr[idx]);
		
		//  arr[idx]를 선택하지 않는 경우
		combination(idx + 1, sum);
	}
}