package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    // 피보나치 수열 : 첫 두항이 0과 1인 수열, 그 이후의 각 항은 앞 두 항의 합으로 정의됨.
    public static long fibonacci(long n) {
        // n이 0일 때 0 반환
        if(n == 0) return 0;
        // n이 1일 때 1 반환
        if(n == 1) return 1;
        // n이 이외의 숫자일 때 n-1항 + n-2항의 결과 반환
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        long result = fibonacci(n);
        System.out.println(result);
    }
}
