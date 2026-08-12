import java.util.Scanner;
import java.util.Stack;

class Solution {
/*
 * 1. 연산자 우선순위 - '+'만 있어서 생략
 * 2. 스캔
 * 3. 후위표기식 변환
 * 4. 계산
 * 5. 출력
 */
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int n = sc.nextInt();	// 수식 길이
			String infix = sc.next();	// 수식
			
			// 후위표기식 변환하고 저장할 문자열
			StringBuilder post = new StringBuilder();
			// 연산자를 저장할 stack
			Stack<Character> stack = new Stack<>();
			
			// 수식 길이만큼 반복
			for(char c : infix.toCharArray()) {
				// 문자인지 숫자인지 확인 - true: 숫자 / false: 문자
				if(Character.isDigit(c)) {
					// 숫자면 post에 붙이기
					post.append(c);
				} else {
					// 문자(연산자)이면 스택에서 꺼내서 post에 붙이기
					while(!stack.isEmpty()) {
						post.append(stack.pop());	
					}
					// 연산자 스택에 넣기
					stack.push(c);
				}
			}
			
			// 스택이 비지 않았으면 꺼내서 post에 붙이기
			while(!stack.isEmpty()) post.append(stack.pop());
			
			// 계산
			Stack<Long> nums = new Stack<>();
			for(char c : post.toString().toCharArray()) {
				if(Character.isDigit(c)) {
					nums.push((long) c - '0');
				} else {
					long b = nums.pop();
					long a = nums.pop();
					nums.push(a+b);
				}
			}
			System.out.println("#" + test_case + " " + nums.pop());
		}
		
	}
}