package ArrayProblem_BinarySearch;

public class SearchInRoatedSortedArray {
    public static int findIndex(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)
                return mid;

            if (array[left] == array[mid])
                left++;
            else if (array[left] < array[mid]) {
                if (target < array[mid] && target >= array[left])
                    left = mid + 1;
                else
                    right = mid - 1;

            } else {
                if (target > array[mid] && target <= array[right])
                    left = mid + 1;
                else
                    right = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 12, 13, 1, 2, 3, 4, 5, 9 };
        int target = 2;
        System.out.println(findIndex(array, target));

    }
}
