import java.util.Scanner;

public class Solution {
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int[][] arr;
	static int N;
	static int M;
	static int sum;
	
    public static void main(String[] args) {
    	
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
        	N = sc.nextInt();
        	M = sc.nextInt();
        	
        	arr = new int[N][M];
        	
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<M; j++) {
        			arr[i][j] = sc.nextInt();
        		}
        	}
        	
        	int max = 0;
        	
        	for(int r=0; r<N; r++) {
        		for(int c=0; c<M; c++) {
        			int k = arr[r][c];  
        			sum = k;
        			
        			for(int d=0; d<4; d++) {
        				int nr = r;
        				int nc = c;
        				
        				for(int i=1; i<=k; i++) {
        					nr += dr[d];
        					nc += dc[d];

        					if(nr < 0 || nc < 0 || nr >= N || nc >= M) break;
        					
        					sum += arr[nr][nc];
        				}
        			}
        			max = Math.max(max, sum);
        		}
        	}

            System.out.println("#" + tc + " " + max);
        }
    }
}