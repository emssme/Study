package 숫자출력;

public class Ex01_07 {
/*
                    1
				2	3
			4	5	6
		7	8	9	10
	11	12	13	14	15
16	17	18	19	20	21
 */
	
	public static void main(String[] args) {
		int N = 6;
		int empty = 0;
		int num = 0;
		
		for(int i=1; i<=N; i++) {
			empty = N-i;
			
			for(int j=empty; j>0; j--) {
				System.out.printf("%3s", " ");
			}
			
			for(int j=0; j<i; j++) {
				System.out.printf("%-3d", ++num);
			}
			System.out.println();
		}
	}
}