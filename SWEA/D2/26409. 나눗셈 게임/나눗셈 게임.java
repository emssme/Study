import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), t = 0;
		while (t++ < T) {
			
			int N = sc.nextInt();
			
			int[] card = new int[N];
			
			for(int i=0; i<N; i++) {
				card[i] = sc.nextInt();
			}
			
			int sum = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i != j) sum += card[i] % card[j];
				}
			}
			
			
			System.out.println("#" + t + " " + sum);
		}
	}
}