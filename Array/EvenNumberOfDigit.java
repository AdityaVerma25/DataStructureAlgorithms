
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberOfDigit {
    public static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num))
                count++;
        }
        return count;
    }

    public static boolean isEven(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        if (count % 2 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] digits = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumber(digits));
    }
}
