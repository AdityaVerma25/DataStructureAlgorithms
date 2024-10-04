package ArrayProblem_BinarySearch;

public class SearchIn2DMatrix {
    public static boolean isFound(int[][] matrix, int target)
    {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col>= 0)
        {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                row++;
                else col--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 9;
        System.out.println(isFound(matrix, target));
    }
}
