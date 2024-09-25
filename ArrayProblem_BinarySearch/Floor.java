package ArrayProblem_BinarySearch;

//Floor is largest number less than or equal to target in an array.
public class Floor {
    public static int findFloor(int[] array, int target) {
        if (target < array[0])
            return -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return array[right];

    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 8, 9 };
        int target = 6;
        System.out.println(findFloor(array, target));

    }

}
