import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			// 테스트 케이스(사용 x)
			int N = sc.nextInt();

			// 점수 등장 회수 카운트 리스트
			int[] cnt = new int[101];
			
			for(int i=0; i<1000; i++) {
				// 점수 받음
				int score = sc.nextInt();
				
				// 점수를 index로 cnt 배열 +1씩 증가
				cnt[score]++;
			}
			
			int maxIdx = 0;
			int max = cnt[0];
			
			for(int i=0; i<cnt.length; i++) {
				if(cnt[i] >= max) {
					// 최대값 찾기
					max = cnt[i];
					// 최대값 찾으면 최대값 index 갱신
					maxIdx = i;
				}
			}
			
			System.out.println("#" + test_case + " " + maxIdx);
		}
	}
}
