//https://leetcode.com/problems/shuffle-the-array/description/
public class SuffleArray {
    public static int[] suffle(int[] array, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = array[i];
            result[2 * i + 1] = array[i+n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] ans = suffle(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
