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
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		String[] arr = new String[T];
		int n = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			// +1씩 증가하여 String 배열에 저장
			arr[i] = String.valueOf(++n);
			
			// string을 int로 변환
			int num = Integer.parseInt(arr[i]);
			// 3, 6, 9 카운트
			int cnt = 0;
			// 박수 여부
			boolean clap = false;

			while (num > 0) {
				// 자리수 마다 3의 배수인지 확인
				int digit = num % 10;

				// 0이 아니고, 3의 배수일 경우
				if (digit % 3 == 0 && digit != 0) {
					// 3,6,9 카운트 증가
					cnt++;
					// 박수 여부 -> true
					clap = true;
				}
				// 다음 자리 수로 이동
				num /= 10;
			}
			
			if (clap) {
				// 박수를 쳤으면
				// cnt 만큼 -- 출력
				for (int j = 0; j < cnt; j++) {
					if(j == cnt-1) {
						// 마지막 -이면 띄어쓰기 추가
						sb.append("- ");
					} else {						
						sb.append("-");
					}
				}
			} else {
				// 숫자 출력
				sb.append(arr[i] + " ");
			}
		}

		System.out.println(sb);
	}
}