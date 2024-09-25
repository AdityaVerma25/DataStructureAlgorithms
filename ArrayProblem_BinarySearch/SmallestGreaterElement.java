package ArrayProblem_BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestGreaterElement {
    public static char findSmallerGreaterElement(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        // if target is greater than all elements, return first element
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f' };
        char target = 'c';
        System.out.println(findSmallerGreaterElement(letters, target));
    }
}
