import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			// 테스트 케이스(사용 x)
			int T = sc.nextInt();
			
			// 배열 크기 100으로 고정
			int[][] ladder = new int[100][100];
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					ladder[i][j] = sc.nextInt();
				}
			}
			
			// 도착지점(2) 좌표 찾기 - (c, 99);
			int c = 0;
			int r = 99;
			
			for(int j=0; j<100; j++) {
				if(ladder[r][j] == 2) {
					c = j;
					
					break;
				}
			}
			
			// r = 0이 될때까지 위로 올라가면서 좌,우에서 1을 만나면 그 방향으로 이동
			while(r > 0) {
				if(c > 0 && ladder[r][c-1] == 1) {
					// 왼쪽
					while(c > 0 && ladder[r][c-1] == 1) {
						c--;
					}
					r--;
				} else if(c < 99 && ladder[r][c+1] == 1) {
					// 오른쪽
					while(c < 99 && ladder[r][c+1] == 1) {
						c++;
					}
					r--;
				} else {
					r--;
				}
			}
			
			System.out.println("#" + test_case + " " + c);
		}
	}
}