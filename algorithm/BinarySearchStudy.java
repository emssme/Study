package algorithm;

public class BinarySearchStudy {
    // 이진 탐색 메서드
    public static int binarySearch(int[] array, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // 중간 값이 찾고자 하는 값인 경우
            if (array[mid] == target) {
                return mid;
            }
            // 중간 값이 찾고자 하는 값보다 큰 경우
            if (array[mid] > target) {
                return binarySearch(array, left, mid - 1, target);
            }
            // 중간 값이 찾고자 하는 값보다 작은 경우
            return binarySearch(array, mid + 1, right, target);
        }

        // 값을 찾지 못한 경우
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(array, 0, array.length - 1, target);

        if (result == -1) {
            System.out.println("배열에 해당 요소가 없습니다.");
        } else {
            System.out.println("해당 요소는 인덱스 " + result + "에 있습니다.");
        }
    }
}
