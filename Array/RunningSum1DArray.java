// https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum1DArray {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int[] result = runningSum(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}