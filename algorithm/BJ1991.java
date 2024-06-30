package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1991 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // stack 생성
        Stack<Integer> st = new Stack<>();

        // 첫번째 줄 정수 k
        int k = Integer.parseInt(br.readLine());

        // k번 반복하여 각 줄 입력
        for (int i = 0; i < k; i++) {
            // 각 줄의 입력을 읽어 정수로 변환
            int n = Integer.parseInt(br.readLine());
            // 입력된 숫자가 0이면
            if (n == 0) {
                // 스택이 비어 있지 않을 경우에만 스택에서 값을 제거
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                // 아닐 경우 해당 수 저장
                st.push(n);
            }
        }

        // 재민이가 최종적으로 적어 낸 수의 합을 출력
        int sum = 0;
        for (int n : st) {
            sum += n; 
        }

        System.out.println(sum);
    }
}
