import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<N; i++) {
				sb.append(1+"/"+N+" ");
			}
			System.out.println("#" + test_case + " " + sb);
		}
	}
}
