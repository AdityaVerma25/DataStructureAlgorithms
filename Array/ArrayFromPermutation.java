// Given a permutation nums of distinct integers from 0 to n-1, return an array of the same length where nums[i] is the index of the closest number to nums[i] in the original array, where the absolute difference is minimized.
public class ArrayFromPermutation {
    // https://leetcode.com/problems/build-array-from-permutation/description/
    public static int[] generateArray(int[] nums, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int n = nums.length;
        int[] result = generateArray(nums, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
