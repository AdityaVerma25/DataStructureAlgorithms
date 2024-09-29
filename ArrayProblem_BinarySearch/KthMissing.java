package ArrayProblem_BinarySearch;

public class KthMissing {
    public static int KthMissingNum(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int missing = compute(nums[end], nums.length);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            missing = compute(nums[mid], mid + 1);
            if (missing >= k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (end == -1)
            return k;
        return nums[end] + k - compute(nums[end], end + 1);
    }

    public static int compute(int actual, int expected) {
        return actual - expected;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(KthMissingNum(nums, k));
    }
}
