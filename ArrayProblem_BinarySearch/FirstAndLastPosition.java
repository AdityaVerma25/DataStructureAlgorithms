package ArrayProblem_BinarySearch;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    // This function just return the index of target
    public static int search(int[] array, int target, boolean findStartIndex) {
        // Potential answer is
        int ans = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return ans;
    }

    public static int[] findFirstAndLast(int[] array, int target) {
        int[] result = { -1, -1 };

        // Check for first occurence of target first
        result[0] = search(array, target, true);
        if (result[0] != -1)
            result[1] = search(array, target, false);
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 5, 5, 6, 7, 8, 9 };
        int target = 5;
        int[] ans = findFirstAndLast(array, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
