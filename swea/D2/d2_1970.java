package D2;

import java.util.Scanner;

public class d2_1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		final int[] price = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt();
			int[] money = new int[price.length];
			
			for(int i=0; i<price.length; i++) {
				if(N >= price[i]) {					
					money[i] = N / price[i];
					N -= price[i] * money[i];
				}
			}
			
			System.out.println("#" + test_case);
			for(int i=0; i<money.length; i++) {
				System.out.print(money[i] + " ");
			}
			System.out.println();
		}
	}
}
