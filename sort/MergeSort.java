public class MergeSort {
    // 합병 정렬 : 분할 정복 전략을 사용하여 배열을 정렬하는 효율적인 알고리즘
    // 배열을 반으로 나누어 각각을 재귀적으로 정렬한 후, 두 개의 정렬된 배열을 합쳐서 최종적으로 정렬된 배열을 만듦.
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void mergeSort(int[] array, int left, int right) {
        // left : 시작 인덱스
        // right : 끝 인덱스
        if (left < right) {
            // 중간 인덱스를 계산
            int mid = (left + right) / 2;

            // 중간 인덱스를 기준으로 배열을 두 부분으로 나누어 정렬
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // 정렬된 두 부분을 병합
            merge(array, left, mid, right);

            // 병합 후 배열 출력
            printArray(array);
            System.out.println("----------------------");
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        // 두 부분의 크기를 계산
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 두 부분을 임시 배열에 복사
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        // 임시 배열을 병합하여 원본 배열에 복사
        int i = 0, j = 0;
        int k = left;

        // L과 R의 배열들을 비교하여 작은 값부터 원본 배열에 복사함
        // i와 j가 각각 L, R 배열의 크기를 넘지 않는 한 계속 반복함
        // 비교하여 작은 값을 원본 배열 array[k]에 복사하고 인덱스 i와 j를 증가시킴 
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // L 배열에 남아있는 요소들을 원본 배열에 복사
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // R 배열에 남아있는 요소들을 원본 배열에 복사
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // 배열을 출력
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
