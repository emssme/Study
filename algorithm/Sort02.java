package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Sort02 {
    // 백준 1181번: 단어정렬
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        // HashSet을 사용하여 중복 단어 제거
        HashSet<String> hashSet = new HashSet<>();

        for(int i=0; i<n; i++){
            hashSet.add(bufferedReader.readLine());
        }

        String [] arr = hashSet.toArray(new String[0]);

        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // compareTo 메서드를 사용하여 두 단어의 길이가 같으면 사전 순으로 정렬
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    // 두 단어의 길이가 다르면 길이를 기준으로 정렬
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(String word : arr){
            stringBuilder.append(word).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
