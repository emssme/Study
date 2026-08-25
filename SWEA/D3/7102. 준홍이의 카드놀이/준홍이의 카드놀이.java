import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			List<Integer> sumList = new ArrayList<>();
			
			// 두 카드 조합 합 리스트에 저장
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=M; j++) {
					sumList.add(i+j);
				}
			}
			
			// 나온 결과 횟수 카운트(key: 합 / value: 횟수)
			Map<Integer, Integer> sumCntMap = new HashMap<>();
			
			// 등장할 확률이 가장 높은 카드 합 리스트
			List<Integer> maxProList = new ArrayList<>();
			int max = 0;
			
			// 카드 합 최소:2 최대: N+M
			for(int i = 2; i<=N+M; i++) {
				int cnt = 1;
				
				// map에 횟수 저장
				for(int j=0; j<sumList.size(); j++) {
					if(i == sumList.get(j)) {
						sumCntMap.put(i, cnt++);						
					}
				}

				// map 순회하며 가장 많이 등장한 숫자 찾기
				if(sumCntMap.get(i) >= max) {
					max = sumCntMap.get(i);
				}
			}
			
			// map 순회하며 가장 많이 등장한 숫자의 key 찾기
			for(Map.Entry<Integer, Integer> entry : sumCntMap.entrySet()) {
				if(entry.getValue().equals(max)) {
					maxProList.add(entry.getKey());
				}
			}

			// 출력
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<maxProList.size(); i++) {
				sb.append(maxProList.get(i) + " ");
			}
			
			System.out.println("#" + test_case + " " + sb);
		}
	}
}