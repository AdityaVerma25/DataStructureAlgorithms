//https://leetcode.com/problems/number-of-good-pairs/submissions/1410382815/

public class NumberOfGoodPair {
    public static int goodPairCount(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(goodPairCount(nums)); // Output: 4
    }
}
