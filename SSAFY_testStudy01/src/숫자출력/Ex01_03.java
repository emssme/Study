package 숫자출력;

public class Ex01_03 {
/*
                1
			2	3
		4	5	6
	7	8	9	10
11	12	13	14	15
 */
	
	public static void main(String[] args) {
		int N = 5;
		int num = 0;
		
		for(int i=1; i<=N; i++) {
			int empty = N-i;
			
			for(int j=1; j<=empty; j++) {
				System.out.printf("%3s", " ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.printf("%-3d", ++num);
			}
			
			System.out.println();
		}
	}
}
