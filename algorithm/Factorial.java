package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static long factorial(long n) {
        // n이 0 또는 1일때는 1을 반환
        if (n == 0 || n == 1) return 1;
        // n이 이외의 숫자 일때는 n * (n-1)을 계속해서 반환
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        long result = factorial(n);
        System.out.println(result);
    }
}
