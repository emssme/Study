/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		final String[] arr = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] stuArr = new int[N][3];
			List<Float> scores = new ArrayList<>();
			
			float kScore;
			String grade;
			
			// 입력된 점수 배열에 할당 후 score 배열에 환산한 점수 저장
			// 중간 -> 기말 -> 과제
			for(int i=0; i<N; i++) {
				for(int j=0; j<3; j++) {
					stuArr[i][j] = sc.nextInt();
				}
				scores.add((float) ((stuArr[i][0] * 0.35) + (stuArr[i][1] * 0.45) + (stuArr[i][2] * 0.2)));
			}
			
			// k번째 점수 저장
			kScore = scores.get(K-1);
            
			// 점수 내림차순으로 sort
			Collections.sort(scores, Collections.reverseOrder());
            
			// 학점 매기기
			grade = arr[scores.indexOf(kScore) / (N/10)];
			
			System.out.println("#" + test_case + " " + grade );
		}
	}
}