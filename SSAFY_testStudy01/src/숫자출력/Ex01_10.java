package 숫자출력;

public class Ex01_10 {
/*
O	N	M	L	K
	J	I	H	G
		F	E	D
			C	B
				A
 */
	
	public static void main(String[] args) {
		int N = 5;
		char c = 'O';
		int empty = 0;
		
		for(int i=0; i<N; i++) {
			empty = N-i;
			for(int j=0; j<i; j++) {
				System.out.printf("%3s", " ");
			}

			for(int j=0; j<empty; j++) {
				System.out.printf("%-3s", c--);
			}
			System.out.println();
		}
		
	}
}