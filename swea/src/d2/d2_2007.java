package d2;

import java.util.Scanner;

public class d2_2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int answer = 0;
			
			for(int i=1; i<10; i++) {
				 if(str.substring(0, i).equals(str.substring(i, i+i))) {
					 answer = i;
					 // 가장 작은 마디에서 멈추도록 break를 추가
					 break;
				 }
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
