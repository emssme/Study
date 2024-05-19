public class InsertionSort {
    // 삽입 정렬 : 배열의 요소를 하나씩 비교하여 적절한 위치에 삽입하면서 정렬하는 알고리즘
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        insertionSort(arr);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            
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
