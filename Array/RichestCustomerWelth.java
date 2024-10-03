//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWelth {
    public static int getWelth(int[][] acounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] inits : acounts) {
            int sum = 0;
            for (int i : inits) {
                sum += i;
            }
            if (sum > ans)
                ans = sum;

        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(getWelth(accounts));
    }
}
