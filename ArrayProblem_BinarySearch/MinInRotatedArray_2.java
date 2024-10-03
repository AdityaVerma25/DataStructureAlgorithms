package ArrayProblem_BinarySearch;

public class MinInRotatedArray_2 {
    public static int findMin(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < array[end]) {
                end = mid;
            } else if (array[mid] > array[end]) {
                start = mid + 1;
            } else
                end--;
        }
        return array[start];
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5 };
        int minimum = findMin(array);
        System.out.println("Minimum is Sorted Rotated Array: "+minimum);
    }
}
