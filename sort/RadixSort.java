import java.util.*;

public class RadixSort {
    // 기수 정렬 : 자릿수별로 정렬을 수행하여 전체 배열을 정렬하는 알고리즘
    public static void main(String[] args) {
        int[] arr = {8581, 1689, 4367, 1045, 2759, 8183, 2736, 8972};
        radixSort(arr);
        printArray(arr);
    }

    public static void radixSort(int[] array) {
        // 배열에서 가장 큰 값을 찾음
        int max = getMax(array);
        int n = array.length;

        // 자릿수에 따라 배열을 정렬
        // exp : 자릿수
        // int exp = 1 : 1로 초기화
        // max / exp > 0 : max / exp 가 0보다 큰 것은 아직 처리할 자릿수가 남았다는 것을 의미함.
        // exp *= 10 : exp를 10배씩 증가
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, n, exp);
            printArray(array);
            System.out.println("----------------------");
        }
    }

    // 배열에서 최대값을 찾는 함수
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 자릿수를 기준으로 배열을 정렬하는 함수
    public static void countSort(int[] array, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        // count 배열 초기화
        Arrays.fill(count, 0);

        // 현재 자릿수에 대한 count 배열 값 저장
        for (int i = 0; i < n; i++) {
            int index = (array[i] / exp) % 10;
            count[index]++;
        }

        // count 배열을 수정하여 출력 배열의 인덱스를 계산
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 출력 배열에 값을 저장하고 원본 배열에 복사
        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i] / exp) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        // 정렬된 값을 원본 배열로 복사
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    // 배열을 출력하는 함수
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
