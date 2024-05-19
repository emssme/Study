public class HeapSort {
    public static void main(String[] args) {
        // 힙 : 힙은 완전 이진 트리의 일종으로, 각 부모 노드가 자식 노드보다 크거나 작은 성질을 가지고 있음.
        // 힙 정렬 : 힙 자료 구조를 사용하여 배열을 정렬하는 알고리즘.
        int[] arr = {8, 1, 4, 10, 2, 6, 27, 0};
        heapSort(arr);
        printArray(arr);
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        // 힙을 구성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // 하나씩 요소를 힙에서 추출
        for (int i = n - 1; i > 0; i--) {
            // 현재 루트(가장 큰 값)를 끝으로 이동
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // 힙의 나머지 부분을 힙 속성 유지
            heapify(array, i, 0);

            printArray(array);
            System.out.println("----------------------");
        }
    }

    // 힙 속성을 유지하는 함수
    public static void heapify(int[] array, int n, int i) {
        // 루트를 가장 큰 값으로 초기화
        int largest = i; 
        // 왼쪽 자식
        int left = 2 * i + 1; 
        // 오른쪽 자식
        int right = 2 * i + 2; 

        // 왼쪽 자식이 루트보다 큰 경우
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 현재 가장 큰 값보다 큰 경우
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // 가장 큰 값이 루트가 아닌 경우 교환
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // 재귀적으로 힙 속성을 유지
            heapify(array, n, largest);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
