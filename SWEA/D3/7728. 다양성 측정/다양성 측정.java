import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			Set<Character> numberSet = new HashSet<>();
			
			String number = sc.next();
			
			for(int i=0; i<number.length(); i++) {
				numberSet.add(number.charAt(i));
			}
			System.out.println("#" + test_case + " " + numberSet.size());
		}
	}
}
