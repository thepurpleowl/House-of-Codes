public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Initialize the first row and the first column
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0]; // Fill the first column
        }
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1]; // Fill the first row
        }

        // Calculate minimum path sum for each cell in the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        // The bottom-right corner contains the minimum path sum
        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println("Output: " + sol.minPathSum(grid1)); // Output: 7

        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Output: " + sol.minPathSum(grid2)); // Output: 12
    }
}
