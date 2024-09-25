package ArrayProblem_BinarySearch;

public class BinarySearch {
    public static int search(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
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

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 6, 7, 8 };
        int target = 5;
        int result = search(array, target);
        System.out.println(result);
    }
}
