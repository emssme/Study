public class ShellSort {
    // 쉘 정렬 : 삽입 정렬의 일반화된 형태로, 초기에는 멀리 떨어진 요소들을 비교하고 정렬하며, 점차 간격을 줄여가면서 최종적으로 전체 배열을 정렬
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        shellSort(arr);
    }

    public static void shellSort(int[] array) {
        int n = array.length;
        
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 간격에 따라 배열의 요소들을 비교하고 정렬함
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                
                // 정렬한 요소들을 교환
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
                
                printArray(array);
                System.out.println("----------------------");
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
