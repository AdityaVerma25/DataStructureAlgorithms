package ArrayProblem_BinarySearch;

public class FindInMountain {
    public static int search(int[] array, int target) {
        int peakIndex = peakElement(array);
        int firstTry = orderAgnosticBinarySearch(array, target, 0, peakIndex);
        if (firstTry != -1)
            return firstTry;
        // try to search in the second half of the array
        return orderAgnosticBinarySearch(array, target, peakIndex + 1, array.length - 1);
    }

    public static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start; // Return the peak element index

    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        // Wheather array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1; // Element not found in array
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 0, 3, 5, 1 };
        int target = 3;
        System.out.println(search(array, target));
    }
}
