public class QuickSort {
    // 퀵 정렬 : 배열을 피벗(pivot)이라는 기준값을 중심으로 두 부분으로 나누어 각각을 정렬하는 방식으로 동작
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void quickSort(int[] array, int low, int high) {
        // low : 현재 부분 배열의 시작 인덱스
        // high : 현재 부분 배열의 끝 인덱스
        if (low < high) {
            int pi = partition(array, low, high);

            // 피벗을 기준으로 배열을 두 부분으로 나누어 각각 정렬
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);

            printArray(array);
            System.out.println("----------------------");
        }
    }

    public static int partition(int[] array, int low, int high) {
        // 피벗을 배열의 마지막 요소로 선택
        int pivot = array[high];

        // 작은 요소들의 인덱스를 초기화
        // 피벗보다 작은 요소들이 배열의 시작 인덱스 이전에 없음을 의미
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같은 경우
            if (array[j] <= pivot) {
                i++;

                // array[i]와 array[j]를 교환
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 피벗을 올바른 위치에 놓기 위해 교환
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // 피벗의 인덱스를 반환
        return i + 1; 
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
