public class SelectionSort {
    // 선택 정렬 : 가장 작은(또는 가장 큰) 요소를 선택하여 해당 요소를 배열의 처음으로 이동시키는 방식
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        selectionSort(arr);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // 배열의 나머지 부분에서 최소값을 찾음
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // 최솟값을 현재 위치로 넣음
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            
            // 배열 출력
            printArray(array);
            System.out.println("----------------------");
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
