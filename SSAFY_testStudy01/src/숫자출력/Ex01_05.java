package 숫자출력;

public class Ex01_05 {
/*
A
B	C
D	E	F
G	H	I	J
K	L	M	N	O
 */
	
	public static void main(String[] args) {
		int N = 5;
		char c = 'A';
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("%-3s", c++);
			}
			System.out.println();
		}
	}
}