package 숫자출력;

public class Ex01_12 {
/*
17	16	15	14	13
	12	11	10
		9
	8	7	6
5	4	3	2	1
 */
	public static void main(String[] args) {
		int N = 5;
		int num = 17;
		int empty = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<empty; j++) {
				System.out.printf("%3s", " ");				
			}
			
			for(int j=0; j<N-empty*2; j++) {
				System.out.printf("%-3d", num--);
			}
			System.out.println();
			
			if(N/2 > i) {
				empty++;
			} else {
				empty--;
			}
		}		
	}
}