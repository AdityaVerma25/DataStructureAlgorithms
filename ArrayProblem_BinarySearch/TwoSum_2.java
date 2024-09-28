package ArrayProblem_BinarySearch;

public class TwoSum_2 {
    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int sum = nums[start] + nums[end];
            if (sum == target)
                return new int[] { start + 1, end + 1 };
            else if (sum < target)
                start++;
            else
                end--;
        }
        return new int[] { start + 1, end + 1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("The two numbers are: " + result[0] + " and " + result[1]);
    }
}
