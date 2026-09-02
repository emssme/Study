import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			char[] arr = sc.next().toCharArray();
			Stack<Character> st = new Stack<>();
			
			int answer = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == '(') {
					// 쇠막대기 또는 레이저의 시작
					st.push(arr[i]);
				} else {
					st.pop();
					if(arr[i-1] == '(') {
						// 레이저
						// 현재 stack의 개수만큼 정답에 더하기
						answer += st.size();
						
					} else {
						// 쇠막대기의 끝
						answer += 1;
					}
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}