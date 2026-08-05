package d2;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class d2_1928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Decoder d = Base64.getDecoder();	
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String s = sc.next();
			sc.nextLine();
			String answer = new String(d.decode(s));
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
