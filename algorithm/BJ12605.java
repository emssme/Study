package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ12605 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문장의 수 n을 읽음
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // 문장을 읽음
            String sentence = br.readLine();

            // 문장을 스페이스바를 기준으로 단어로 나눔
            String[] words = sentence.split(" ");

            // stack 생성
            Stack<String> st = new Stack<>();

            // 나눈 단어를 스택에 추가
            for (String word : words) {
                st.push(word);
            }

            // 출력 형식에 맞게 단어들을 뒤집어 출력
            System.out.print("Case #" + (i + 1) + ":");
            while (!st.isEmpty()) {
                System.out.print(" " + st.pop());
            }
             // 각 케이스마다 줄 바꿈 추가
            System.out.println();
        }
    }
}
