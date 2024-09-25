package ArrayProblem_BinarySearch;

// Ceiling is smallest number greater than or equal to target in an array.
//https://leetcode.com/problems/search-insert-position/description/
public class Ceiling {
    public static int findCeiling(int[] array, int target) {
        if (target > array[array.length - 1])
            return -1;
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;

        }
        return array[start];
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 8, 9 };
        int target = 7;
        System.out.println(findCeiling(array, target));

    }
}
