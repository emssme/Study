import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), t = 0;
		while (t++ < T) {
			int N = sc.nextInt();
			int lo = sc.nextInt();
			int hi = sc.nextInt();
			
			int[] arr = new int[10001];
			
			for(int i=0; i<N; i++) {
				arr[sc.nextInt()]++;
			}
			
			for(int i=2; i<10001; i++) {
				arr[i] += arr[i-1];
			}
			
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int ans = Integer.MAX_VALUE;
			
			for(int i=1; i<=9998; i++) {
				sum1= arr[i];
				if(sum1 < lo || sum1 > hi) continue;
				
				
				for(int j=i+1; j<=9999; j++) {
					sum2 = arr[j] - arr[i];
					
					sum3 = N - arr[j];
					
					if(sum2 < lo || sum2 > hi || sum3 < lo  || sum3 > hi) continue;
					
					int max = Math.max(sum1, Math.max(sum2, sum3));
					int min = Math.min(sum1, Math.min(sum2, sum3));
					ans = Math.min(ans, max - min);
				}
			}
			
			System.out.println("#" + t + " " + (ans == Integer.MAX_VALUE ? -1 : ans));
		}
	}
}