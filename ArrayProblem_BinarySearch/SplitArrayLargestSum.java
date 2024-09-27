package ArrayProblem_BinarySearch;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // now start is the maximum element of the array
            end += nums[i]; // now end is the sum of all elements in the array
        }
        // Bianry Search
        while (start < end) {
            // Try for the middle as potential asnwer
            int mid = start + (end - start) / 2;

            // Calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // You can't add this in sumarray, you need to create a new sum array, and
                    // add----- Sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            }
            else {
                end = mid;
            }

        }
        return end; // start == end
    }

    public static void main(String[] args) {
        int[] array = { 7, 2, 5, 10, 8 };
        int m = 2;
      System.out.println(splitArray(array, m));
    }

}
