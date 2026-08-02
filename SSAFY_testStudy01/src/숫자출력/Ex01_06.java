package 숫자출력;

public class Ex01_06 {
/*
15	14	13	12	11
10	9	8	7
6	5	4
3	2
1
 */
	
	public static void main(String[] args) {
		int N = 5;
		int num = 15;
		
		for(int i=0; i<N; i++) {
			int cnt = N-i;
			for(int j=0; j<cnt; j++) {
				System.out.printf("%-3s", num--);
			}
			System.out.println();
		}
	}
}