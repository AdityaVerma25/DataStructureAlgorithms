package ArrayProblem_BinarySearch;

public class InfiniteArray {
    public static int search(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // Default value if target is not found
    }

    static int ans(int[] array, int target) {
        // first find the range of the array
        // first start with a size of box 2
        int start = 0;
        int end = 1;
        while (target > array[end]) {
            int newStart = end + 1;
            // double the size of box
            // end = previous end + boxsize * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(array, target, start, end);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(ans(arr, target));

    }
}
