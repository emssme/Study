import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			List<Integer> priceList = new ArrayList<>();
			
			// 매매가 list에 할당
			for (int i=0; i<N; i++) {
				priceList.add(sc.nextInt());
			}
			
			long totalProfit = 0;
			int maxPrice = 0;
			
			for(int i=N-1; i>=0; i--) {
				if(priceList.get(i) > maxPrice ) {
					// 최고가 갱신
					maxPrice = priceList.get(i);
				} else {
					// 판매 수익 계산
					totalProfit += maxPrice - priceList.get(i);
				}
			}
			
			System.out.println("#" + test_case + " " + totalProfit);
		}
	}
}
