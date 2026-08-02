package 숫자출력;

public class Ex01_04 {
/*
2	4	6	8	10
	12	14	16	18
		20	22	24
			26	28
				30
 */
	
	public static void main(String[] args) {
		int N = 5;
		int num = 2;
		
		for(int i=0; i<N; i++) {
			int empty = N-i;
			for(int j=0; j<i; j++) {
				System.out.printf("%3s", " ");
			}
			
			for(int j=0; j<empty; j++) {
				System.out.printf("%-3s", num);
				num +=2;
			}
			System.out.println();
		}
	}
}

