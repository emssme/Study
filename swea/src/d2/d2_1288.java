package d2;

import java.util.Scanner;
import java.util.Set;
/*
 * 1. 테스트케이스 번호 T값 입력받기.
 * 2. 테스트케이스 마다,
 *  2-1. num(N)_값을 입력받는다.
 *  2-2. 0~9까지의 수가 담긴 numbers 배열과, 그 수가 나왔는지 체크하는 isVisited 배열을 초기화하고 값을 할당해준다.
 *  2-3. while문으로 계속 num 을 곱해가면서 (num*count)
 *      2-3-0. while문 한번 돌 때마다 count 값을 증가시키면서 break 전까지 총 몇번 곱했는지 확인
 *      2-3-1. 뒤에서부터 수 하나씩 빼서 나왔던 숫자인지 확인하고
 *      2-3-2. 처음 나온 숫자면 visit 처리 해주고, seenCount++
 *      2-3-3. 다음 수 판별을 위해 temp 값 수정
 *  2-4. 모두 나왔으면 반복 종료 (seenCount가 10이 되면)
 * 3. kN번 째 양을 셌을 때 그 kN을 출력하라 했으니깐 num*count 값을 result에 할당하여 출력
 */
public class d2_1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			// 0~9 등장 여부
			boolean[] checkArr = new boolean[10];
			// 모은 숫자 종류 개수
			int seeCount = 0;
			// 몇번 째로 세는 중인지
			int multiple = 0;
			
			while(seeCount < 10) {
				// 10종류 다 모을때까지 반복
				multiple++;
				int currentNum = N * multiple;
				// 이번에 세는 양 번호
				int temp = currentNum;
				while(temp > 0) {
					// 자리 수 분해
					int digit = temp % 10;
					if(!checkArr[digit]) {
						// 해당 숫자 있으면 true 로 변경
						checkArr[digit] = true;
						// 모은 숫자 +1
						seeCount++;
					}
					temp /= 10;
				}
			}
			System.out.println("#" + test_case + " " + N * multiple);	// kN 출력
		}
	}
}
