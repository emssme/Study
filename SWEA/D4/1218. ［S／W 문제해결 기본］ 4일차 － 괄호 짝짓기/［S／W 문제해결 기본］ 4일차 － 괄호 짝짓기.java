import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			
			String str = sc.next();
			
			Stack<Character> st = new Stack<>();
			
			int answer = 0;
			
			for(char c : str.toCharArray()) {
				
				if(c == '{' || c == '[' || c == '(' || c == '<') {
					// 여는 괄호들 넣기
					st.push(c);
				} else {
					if(c == '}') {
						if(!st.isEmpty() && st.peek() == '{') st.pop();	// 짝 맞으면 stack에서 제거
						else st.push(c);								// 아니면 넣기
					} else if(c == ']' ) {
						if(!st.isEmpty() && st.peek() == '[') st.pop();
						else st.push(c);
					} else if(c == ')') {
						if(!st.isEmpty() && st.peek() == '(') st.pop();
						else st.push(c);
					} else if(c =='>') {
						if(!st.isEmpty() && st.peek() == '<') st.pop();
						else st.push(c);
					}
				}
			}
			
			if(st.isEmpty()) answer = 1;
			System.out.println("#" + test_case + " " + answer);
		}
	}
}