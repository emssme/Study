package 숫자출력;

public class Ex01_09 {
/*
3	6	9	12	15
18	21	24	27
30	33	36
39	42
45
 */
	
	public static void main(String[] args) {
		int N = 5;
		int num = 3;
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("%-3d", num);
				num += 3;
			}
			System.out.println();
		}
	}
}