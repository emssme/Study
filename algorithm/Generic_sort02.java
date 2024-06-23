package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

class GenericSorter<T extends Comparable<T>> {
    private T[] arr;

    public GenericSorter(T[] arr){
        this.arr = arr;
    }

    public void sort() {
        Arrays.sort(arr);
    }

    public void printArray() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : arr) {
            stringBuilder.append(element).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
public class Generic_sort02 {
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

    GenericSorter<String> sorter = new GenericSorter<>(arr);
    GenericSorter.sort();
    GenericSorter.printArray();
}
