package 숫자출력;

public class Ex01_02 {
/*
1	2	3	4	5
6	7	8	9
10	11	12
13	14
15
 */
	
	public static void main(String[] args) {
		int N = 5;
		int num = 0;
		
		for(int i=0; i<N; i++) {
			int cnt = N-i;
			for(int j=0; j<cnt; j++) {
				System.out.printf("%-3s", ++num);
			}
			System.out.println();
		}
	}
}
