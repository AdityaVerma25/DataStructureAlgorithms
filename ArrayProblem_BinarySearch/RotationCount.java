package ArrayProblem_BinarySearch;

public class RotationCount {
    public static int findRotationCount(int[] array) {
        int start = 0;
        int end = array.length - 1;
        if (array[start] <= array[end])
            return 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1])
                return mid + 1;
            else if (mid > start && array[mid] < array[mid - 1])
                return mid;
            else if (array[start] >= array[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = { 15, 18, 2, 3, 6, 7 };
        System.out.println(findRotationCount(array));
    }
}
