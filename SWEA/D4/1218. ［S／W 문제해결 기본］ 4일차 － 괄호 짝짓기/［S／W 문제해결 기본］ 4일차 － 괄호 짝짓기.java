import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String g = sc.next();
			int tmp = 1;
			int cnt = 0;

			String[] arr = new String[N];

			for (int i = 0; i < N; i++) {
				arr[i] = String.valueOf(g.charAt(i));
			}

			Map<String, String> map = new HashMap<>();

			map.put("(", ")");
			map.put("{", "}");
			map.put("[", "]");
			map.put("<", ">");

			if (N % 2 == 0) {
				for (int i = 0; i < N; i++) {
					for (int j = 1; i + j < N; j++) {
						if (arr[i + j].equals(map.get(arr[i]))) {
							arr[i + j] = String.valueOf(i+j);
							cnt++;
							break;
						}
					}

				}
							
			}
			
			
			if(cnt != N/2) {
				tmp = 0;
			}	
			
			System.out.printf("#%d %d%n", test_case, tmp);	


		}
	}
}
