import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			
			char[][] arr = new char[100][];
			
			for(int i=0; i<100; i++) {
				arr[i] = sc.next().toCharArray();
			}
			
			int max = Integer.MIN_VALUE;
			
			// 가로
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					
					for(int k=j; k<100; k++) {
						
						int s = j;	// 시작문자
						int e = k;	// 마지막 문자
						boolean pal = true;
						
						// 시작문자가 마지막문자의 index보다 작을때까지 반복
						while(s < e) {
							// 양 끝의 문자가 같은지 비교
							// 같지 않으면 boolea -> false로 변경하고 종료
							if(arr[i][s] != arr[i][e]) {
								pal = false;
								break;
							}
							// 시작문자 index 증가시키고, 마지막문자 index 감소시키면서 문자열 좁혀가
							s++;
							e--;
						}
						if(pal && k - j + 1 > max) {
							max = Math.max(max, k - j + 1);
						}
					}
				}
			}
			
			// 세로
			for(int j=0; j<100; j++) {
				for(int i=0; i<100; i++) {
					StringBuilder sb = new StringBuilder();
					
					for(int k=i; k<100; k++) {
						int s = i;	// 시작문자
						int e = k;	// 마지막 문자
						boolean pal = true;
						
						// 시작문자가 마지막문자의 index보다 작을때까지 반복
						while(s < e) {
							if(arr[s][j] != arr[e][j]) {
								pal = false;
								break;
							}
							s++;
							e--;
						}
						if(pal && k - i + 1 > max) {
							max = Math.max(max, k - i + 1);
						}
					}
					
				}
			}
			System.out.println("#" +  + T + " "+ max);
		}
	}
}