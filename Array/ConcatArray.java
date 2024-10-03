
//https://leetcode.com/problems/concatenation-of-array/submissions/1410327018/
public class ConcatArray {
    public static int[] cancatArray(int[] array, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = array[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i + n] = array[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        int[] result = cancatArray(arr, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
