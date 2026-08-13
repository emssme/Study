import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<N; i++) {
				
				String Ci = sc.next();
				int Ki = sc.nextInt();
				
				for(int j=0; j<Ki; j++) {
					sb.append(Ci);
				}
			}
			
			// 출력
			StringBuilder print = new StringBuilder();
			
			print.append("#" + test_case + "\n");
            for (int i = 0; i < sb.length(); i += 10) {
                int end = Math.min(i + 10, sb.length());
                print.append(sb, i, end).append("\n");
            }
			System.out.print(print);
		}
	}
}
