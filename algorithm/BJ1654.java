package algorithm;

import java.util.Scanner;

public class BJ1654 {
    // https://www.acmicpc.net/problem/1654
    // 랜선 자르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이미 가지고 있는 랜선의 개수 K
        int K = sc.nextInt();
        //필요한 랜선의 개수
        int N = sc.nextInt();

        int length [] = new int [K];

        long maxLength = 0;

        // 랜선의 길이 입력
        for(int i=0; i < K; i++){
            length[i] = sc.nextInt();
            // 최대 랜선의 길이
            if (length[i] > maxLength) {
                maxLength = length[i];
            }
        }

        // 랜선 최소값
        long left = 1;
        long right = maxLength;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            long count = 0;

            for(int i=0; i<K; i++){
                // mid 길이로 랜선 자른 개수
                count += length[i] / mid;
            }
            
            // 잘라낸 개수가 필요한 랜선의 개수 N보다 작거나 같을때
            if (count >= N) {
                result = mid;
                // 최소값이 더 긴 길이의 랜선 탐색
                left = mid + 1;
            } else {
                // 최대값이 더 작은 길이의 랜선 탐색
                right = mid - 1;
            }
        }
        System.out.println(result);            
    }
}
