import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			
			String[] line;
			String[][] arr = new String[100][];
			
			for(int i=0; i<100; i++) {
				line = sc.next().split("");
				
				arr[i] = new String[line.length];
				
				for(int j=0; j<100; j++) {
					arr[i][j] = line[j];
				}
			}
			int max = Integer.MIN_VALUE;
			int length = 0;
			
			// 가로
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					StringBuilder sb = new StringBuilder();
					
					for(int k=j; k<100; k++) {
						
						sb.append(arr[i][k]);
						
						// 원래 단어
						String original = sb.toString();
						// 회문
						String reverse = new StringBuilder(original).reverse().toString();
						
						if(original.equals(reverse) && !original.isEmpty()) {
							length = original.length();
						}
						
						// 최대값 갱신
						max = Math.max(max, length);
					}
				}
			}
			
			// 세로
			for(int j=0; j<100; j++) {
				for(int i=0; i<100; i++) {
					StringBuilder sb = new StringBuilder();
					
					for(int k=i; k<100; k++) {
						sb.append(arr[k][j]);
						
						String original = sb.toString();
						String reverse = new StringBuilder(original).reverse().toString();
						
						if(original.equals(reverse) && !original.isEmpty()) {
							length = original.length();
						}
						max = Math.max(max, length);
					}
					
				}
			}
			System.out.println("#" + T + " " + max);
		}
	}
}