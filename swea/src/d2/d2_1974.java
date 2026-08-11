package d2;

import java.util.Scanner;

public class d2_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[9][9];
			
			int answer = 0;
			boolean check = true;
			
			// 입력 값 배열에 할당.
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 가로 확인
			for(int i=0; i<9; i++) {
				int sum = 0;
				for(int j=0; j<9; j++) {
					sum += arr[i][j];
				}
				if(sum != 45) check = false;
			}
			
			// 세로 확인
			for(int j=0; j<9; j++) {
				int sum = 0;
				
				for(int i=0; i<9; i++) {
					sum += arr[i][j];
				}
				if(sum != 45) check = false;
			}
			
			// 3*3 확인
			for(int i=0; i<9; i+=3) { 
				for(int j=0; j<9; j+=3) {
					int sum = 0;
					// 3*3 순회하면서 확인
					for(int mi = 0; mi<3; mi++) {
						for(int mj = 0; mj<3; mj++) {
							sum += arr[i + mi][j + mj];
						}
					}
					if(sum != 45) check = false;
				}
			}
			
			if(check == true) answer = 1;
			else answer = 0;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
