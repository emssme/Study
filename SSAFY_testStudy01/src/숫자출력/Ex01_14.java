package 숫자출력;

public class Ex01_14 {
/*
		1
	2
3
	4
		5
 */
	public static void main(String[] args) {
		int N = 5;
		int num = 1;
		int empty = 0;

		for(int i=0; i<N; i++) {
			for(int j=0; j<Math.abs(i-N/2); j++) {
				System.out.printf("%3s", " ");
			}
			System.out.printf("%-3s", num++);
			System.out.println();
			
			if(empty > i) {
				empty--;
			} else {
				empty++;
			}
		}
		
	}
}