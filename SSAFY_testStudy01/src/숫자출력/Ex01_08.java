package 숫자출력;

public class Ex01_08 {
/*
1
3	5
7	9	11
13	15	17	19
21	23	25	27	29
 */
	
	public static void main(String[] args) {
		int N = 5;
		int num = 1;
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("%-3d", num);
				num += 2;
			}
			System.out.println();
		}
	}
}