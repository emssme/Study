import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			Queue<String> q = new ArrayDeque<>();
			
			for(int i=0; i<N; i++) {
				q.offer(sc.next());
			}
			
			Queue<String> q1 = new ArrayDeque<>();
			Queue<String> q2 = new ArrayDeque<>();

			for(int i=0; i<N; i++) {
				if(i < (float) N/2) {
					q1.offer(q.poll());
				} else {
					q2.offer(q.poll());
				}
			}
			
			for(int i=0; i<N; i++) {
				if(i % 2 == 0) {
					q.offer(q1.poll());
				} else {
					q.offer(q2.poll());
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<N; i++) {
				sb.append(q.poll() + " ");
			}
			
			System.out.println("#" + tc + " " + sb);
		}
	}
}