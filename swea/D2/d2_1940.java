package D2;

import java.util.Scanner;

public class d2_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			int speed = 0;
			int distance = 0;
			int now = 0;
			
			for(int i=0; i<N; i++) {
				int command = sc.nextInt();
				
				if(command != 0) {
					now = sc.nextInt();
					
					if(command == 1) {
						// 가속
						speed += now;
						
					} else {
						speed -= now;
						if(speed < 0) {
							speed = 0;
						}
					}
				}
				distance += speed;
			}
			System.out.println("#" + test_case + " " + distance);
		}
	}
}
