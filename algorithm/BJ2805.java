package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] countLength = br.readLine().split(" ");
        int n = Integer.parseInt(countLength[0]);
        int m = Integer.parseInt(countLength[1]);

        String[] height = br.readLine().split(" ");
        int[] trees = new int[n];

        int max = 0;

        // tree[i]가 max보다 크면 가장 높은 나무의 높이를 max에 저장
        for(int i=0; i<n; i++){
            trees[i] = Integer.parseInt(height[i]);
            if(trees[i] > max){
                trees[i] = max;
            }
        }

        long first = 0;
        long mid = 0;
        long end = max;
        
        while(first <= end){
            mid = (first + end) / 2;
        }
    }
}
