package NormalQuestion;

public class grid {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0},
                {1, 0, 1}
        };
        System.out.println(minimumArea(grid));  // Output: 6
    }

    public static int minimumArea(int[][] grid) {
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if (minRow == Integer.MAX_VALUE) {

            return 0;
        }

        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;
        return height * width;
    }
}
