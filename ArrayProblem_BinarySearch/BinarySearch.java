package ArrayProblem_BinarySearch;

public class BinarySearch {
    public static int findIndex(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)
                return mid;
            else if (target > array[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 5, 6, 10, 25, 30 };
        int target = 10;
        System.out.println(findIndex(array, target));

    }
}
