// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class SmallerToCurrentNumber {
    public static int[] smallerNumber(int[] values, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (values[j] < values[i])
                    count++;
            }
            ans[i] = count;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int n = nums.length;
        int[] result = smallerNumber(nums, n);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
