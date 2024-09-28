package ArrayProblem_BinarySearch;

public class Sqrt {
    public static int isSqrt(int num) {
        int start = 1;
        int end = num;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                ans = mid;
                break;
            } else if (mid * mid < num) {
                start = mid + 1;
                ans = mid;
            } else
                end = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isSqrt(num));
    }
}
