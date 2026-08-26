import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int length = sc.nextInt();
			
			String[] line;
			String[][] arr = new String[8][];
			
			for(int i=0; i<8; i++) {
				line = sc.next().split("");
				arr[i] = new String[line.length];
				
				for(int j=0; j<line.length; j++) {
					arr[i][j] = line[j];
				}
			}
			
			List<String> paliList = new ArrayList<>();
			
			// 가로
			for(int i=0; i<8; i++) {
				for(int j=0; j<=8-length; j++) {
					StringBuilder sb = new StringBuilder();
					for(int k=j; k<j+length; k++) {
						sb.append(arr[i][k]);
					}
					paliList.add(sb.toString());
				}
			}
			
			// 세로
			for(int j=0; j<8; j++) {
				for(int i=0; i<=8-length; i++) {
					StringBuilder sb = new StringBuilder();
					for(int k=i; k<i+length; k++) {
						sb.append(arr[k][j]);
					}
					paliList.add(sb.toString());
				}
			}
			
			int cnt = 0;
			
			for(int i=0; i<paliList.size(); i++) {
				String original = paliList.get(i);
				String reverse = new StringBuilder(original).reverse().toString();
				
				if(reverse.equals(original)) {
					cnt++;
				}
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}