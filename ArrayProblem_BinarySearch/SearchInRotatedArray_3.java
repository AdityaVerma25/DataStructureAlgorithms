package ArrayProblem_BinarySearch;

public class SearchInRotatedArray_3 {

    public static int search(int[] array, int target) {
        int pivot = findPivot(array);
        if (pivot == -1)
            return binarySearch(array, target, 0, array.length - 1);
        if (array[pivot] == target)
            return pivot;
        else if (target >= array[0])
            return binarySearch(array, target, 0, pivot - 1);
        return binarySearch(array, target, pivot + 1, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1; // Element not found in array
    }

    private static int findPivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1])
                return mid;
            else if (mid > start && array[mid] < array[mid - 1])
                return mid - 1;
            else if (array[mid] <= array[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));

    }
}
