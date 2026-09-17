import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
    	
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	String str = sc.next();
        	
        	String answer = "";
        	
        	for(int i=0; i<=N-M; i++) {
        		
        		String original = str.substring(i, i + M);
        		String reverse = new StringBuilder(original).reverse().toString();
        		
        		if(original.equals(reverse)) answer = original;
        	}
        	
            System.out.println("#" + tc + " " + ((answer.equals("")) ? "NONE" : answer ));
        }
    }
}