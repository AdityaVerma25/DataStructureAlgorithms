package ArrayProblem_BinarySearch;

import java.util.Arrays;

public class IntersectionOfArray_2 {
    public static int[] intersection(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] < array2[j])
                i++;
            else if (array1[i] > array2[j])
                j++;
            else {
                array1[k++] = array1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(array1, 0, k);
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 2, 1 };
        int[] array2 = { 2, 2 };
        System.out.println(intersection(array1, array2));
    }
}
