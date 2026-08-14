import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			List<Integer> incomeList = new ArrayList<>();
			
			int sum = 0;
			
			for(int i=0; i<N; i++) {
				incomeList.add(sc.nextInt());
			}
			
			// 소득 평균 구하기
			for(int i=0; i<N; i++) {
				sum += incomeList.get(i);
			}
			int avg = sum / N;
			
			// 평균 소득 이하인 사람 수 구하기
			int cnt = 0;
			for(int i=0; i<N; i++) {
				if(incomeList.get(i) <= avg) cnt++;
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
