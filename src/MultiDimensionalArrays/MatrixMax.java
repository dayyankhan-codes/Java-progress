package MultiDimensionalArrays;

// Find the largest value in a two-dimensional array and its position.
public class MatrixMax {
    public static void main(String[] args) {
        int[][] grid = {
                {3, 8, 1},
                {4, 2, 9},
                {7, 5, 6}
        };
        int max = grid[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > max) {
                    max = grid[r][c];
                    maxRow = r;
                    maxCol = c;
                }
            }
        }
        System.out.println("Largest = " + max + " at row " + maxRow + ", column " + maxCol);
    }
}
