package ArrayProblem_BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndex {
    public static int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println(findPeakElement(arr));
        
    }
}
