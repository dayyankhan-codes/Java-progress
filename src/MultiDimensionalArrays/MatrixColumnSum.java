package MultiDimensionalArrays;

public class MatrixColumnSum {
    public static void main(String[] args){
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int col = 1;
        int sum = 0;
        for (int r = 0; r < grid.length; r++){
            sum = sum + grid[r][col];
        }
        System.out.println("Sum of column " + col + " = " + sum);
    }
}
