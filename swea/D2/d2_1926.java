package D2;

import java.util.Scanner;

public class d2_1926 {
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
