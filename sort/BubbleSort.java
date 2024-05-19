public class BubbleSort {
    // 버블 정렬 : 인접한 두 요소를 비교하여 필요에 따라 자리를 바꾸는 방식으로 배열을 정렬하는 간단한 알고리즘
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 인접한 요소들을 비교하여 필요하면 스왑
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // array[j]와 array[j + 1]를 교환
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            printArray(array);
            System.out.println("----------------------");
            
            // 더 이상 스왑이 발생하지 않으면 배열이 정렬된 상태
            if (!swapped) {
                break;
            }
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
