package ArrayProblem_BinarySearch;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int n) {
        if (n < 1)
            return false;
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sqr = (long) mid * mid;
            if (sqr == n)
                return true;
            else if (sqr > n)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }
}
