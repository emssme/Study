package 숫자출력;

public class Ex01_11 {
	/*
	    	1
		2	3	4
	5	6	7	8	9
		10	11	12
			13
	*/
	
	public static void main(String[] args) {
		int N = 5;
		int empty = N/2;
		int num = 1;
		
		for(int i=0; i<N; i++) {
			
			for(int j=empty; j>0; j--) {
				System.out.printf("%3s", " ");
			}
			
			for(int j=0; j<N-empty*2; j++) {
				System.out.printf("%-3d", num++);
			}
			System.out.println();
			
			if(N/2 > i) {
				empty--;
			} else {
				empty++;
			}
		}
	}
}