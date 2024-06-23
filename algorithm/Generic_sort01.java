package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 제너릭 클래스 : 클래스 선언 시에 타입을 파라미터로 받을 수 있도록 하는 클래스
// 제너릭 클래스의 정의는 클래스 이름 뒤에 꺾쇠 괄호(<>)를 사용하여 타입 파라미터를 명시하는 방식
// 제너릭 클래스를 정의하는 부분
class Sorter<T extends Comparable<T>> {
    private T[] arr;

    // 배열을 받아서 저장
    public Sorter(T[] arr) {
        this.arr = arr;
    }

    // 배열을 정렬하는 메서드
    public void sort() {
        // 배열을 오름차순으로 정렬하는 메서드
        Arrays.sort(arr);
    }

    // 배열의 요소를 출력하는 메서드
    public void printArray() {
        for (T element : arr) {
            System.out.println(element);
        }
    }
}

public class Generic_sort01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 제너릭 클래스를 사용하여 배열을 정렬하고 출력
        // Integer 타입으로 생성
        Sorter<Integer> sorter = new Sorter<>(arr);
        // 배열을 오름차순으로 정렬(Arrays.sort)
        sorter.sort();
        // 배열 출력S
        sorter.printArray();
    }
}
