import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			
			List<Integer> list = new ArrayList<>();
			
			// 입력받은 값 list에 담기
			for(int i=0; i<8; i++) {
				list.add(sc.nextInt());
			}
			
			// 감소할 숫자
			int minus = 1;
			
			// list의 마지막 숫자가 0이될때까지 반복
			while(list.get(7) > 0) {
				int num = list.get(0) - minus;
				
				// 첫번째값 제거
				list.remove(0);
				// 감소시킨 숫자 리스트 마지막으로 이동
				list.add(num);
				// 감소값 증가
				minus++;		
				
				// 1사이클에 5감소이므로 다시 초기화
				if(minus > 5) minus = 1;
			}
			
			// 숫자 감소할때 0보다 작아지는 경우 0으로 유지
			if(list.get(7) <= 0) {
				list.set(7, 0);
			}
			
			// 출력
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<list.size(); i++) {
				sb.append(list.get(i) + " ");
			}
			System.out.println("#" + tc + " " + sb);
		}
	}
}