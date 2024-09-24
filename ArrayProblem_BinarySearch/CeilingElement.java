
// Problem: 35 leetcode find Insert Positions


package ArrayProblem_BinarySearch;

public class CeilingElement {
    public static int findCeiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
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
        int[] array = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(findCeiling(array, target));
    }
}
