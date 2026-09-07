import java.util.Scanner;

public class Solution {
	static int N;
	static int L;
	static int [] Tarr;
	static int [] Karr;
	static int calorie;
	static int maxScore;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(), t=0;
		
		while (t++ < T) {
			N = sc.nextInt();
			L = sc.nextInt();
			Tarr = new int[N];
			Karr = new int[N];
			
			for(int i=0; i<N; i++) {
				Tarr[i] = sc.nextInt();
				Karr[i] = sc.nextInt();
			}
			
			maxScore = 0;
			
			hamburger(0, 0, 0);
			
			System.out.println("#" + t + " " + maxScore);
		}
	}

	static void hamburger(int idx, int score, int cal) {
		// 칼로리 초과하면 X
		if(cal > L) return;
		
		// 모든 재료를 다 본 경우
		if(idx == N) {
			if(score > maxScore) {
				maxScore = score;
			}
			return;
		}
		
		// idx번째 재료 선택하는 경우
		hamburger(idx+1, score+Tarr[idx], cal + Karr[idx]);
		// idx번째 재료 선택하지 않는 경우
		hamburger(idx+1, score, cal);		
	}
}