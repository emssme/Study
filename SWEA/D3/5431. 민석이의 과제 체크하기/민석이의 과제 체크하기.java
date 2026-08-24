import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			boolean[] stuArr = new boolean[N];
			int[] subArr = new int[K];
			
			// 제출한 학생 리스트
			for(int i=0; i<K; i++) {
				subArr[i] = sc.nextInt();
			}
			
			// 제출 했으면 stuArr true로 변경
			for(int i=0; i<stuArr.length; i++) {
				for(int j=0; j<subArr.length; j++) {
					if(i+1 == subArr[j] ) {
						
						stuArr[i] = true;
					}
				}
			}
			
			// false인 학생번호 stringbuilder에 추가
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<stuArr.length; i++) {
				if(stuArr[i] == false) {
					sb.append(i+1 + " ");
				}
			}
			
			System.out.println("#" + test_case + " " + sb);
		}
	}
}