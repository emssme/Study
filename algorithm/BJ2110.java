package algorithm;

import java.util.Scanner;

public class BJ2110 {
    //https://www.acmicpc.net/problem/2110
    // 공유기 설치
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 집의 개수
        int N = sc.nextInt();
        // 공유기 개수
        int C = sc.nextInt();

        int houses [] = new int[N];

        for(int i=0; i<C; i++){
            houses[i] = sc.nextInt();
        }

        // 집 좌표 거리의 최소값
        long left = 1;
        // 집 좌표의 거리
        long right = houses[N-1] - houses[0];
        long result = 0;

    }
}
