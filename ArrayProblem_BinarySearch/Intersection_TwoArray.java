package ArrayProblem_BinarySearch;

import java.util.HashSet;

public class Intersection_TwoArray {
    public static int[] interSection(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }

        HashSet<Integer> Intersection = new HashSet<>();
        for (int j : array2) {
            if (set.contains(j)) {
                Intersection.add(j);
            }
        }
        int[] result = new int[Intersection.size()];
        int index = 0;
        for (int num : Intersection) {
            result[index++] = num;
        }
        return result;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 2, 1 };
        int[] array2 = { 2, 1 };
        int[] result = interSection(array1, array2);
        printArray(result);
    }
}
