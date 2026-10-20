package MultiDimensionalArrays;
//adding up every cell in a 2D Array

public class MatrixSumAll {
    public static void main(String[] args){
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int total = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                total = total + grid[r][c];
            }
        }
        System.out.println("Sum of all cells = " + total);
    }
}
