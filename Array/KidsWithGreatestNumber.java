//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1410381583/

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumber {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            if (i > max)
                max = i;
        }
        for (int j : candies) {
            if (j + extraCandies >= max)
                result.add(true);
            else result.add(false);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        for (boolean b : ans) {
            System.out.print(b + " ");
        } 
    }

}