//https://leetcode.com/problems/transpose-matrix/description/

public class TransposeMatrix {
    public static int[][] getTransposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] transpose = getTransposeMatrix(matrix);
        for (int[] row : transpose) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
