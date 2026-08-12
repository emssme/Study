package D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class d2_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			List<Integer> numlist = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				numlist.add(sc.nextInt());
			}
			// �������� ����
			Collections.sort(numlist);
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<N; i++) {
				sb.append(numlist.get(i));
				if(i<N-1) sb.append(" ");
			}
			
			System.out.println("#" + test_case + " " + sb.toString());
		}
	}
}
