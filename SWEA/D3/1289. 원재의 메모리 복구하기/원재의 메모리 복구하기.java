import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String memory = sc.next();
			
			StringBuilder sb = new StringBuilder();
			char cur = '0';
			int cnt = 0;
			
			for(int i=0; i<memory.length(); i++) {
				char c = memory.charAt(i);
                // 현재값과 목표가 다르면
				if(memory.charAt(i) != cur) {
					cnt++;
                    // 반전
					cur = (cur == '0') ? '1' : '0';
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
