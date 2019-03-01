class Solution {
    /*
     * This should be a dynamic programming problem. Dynamic Programming is
     * memoizing intermediate results when doing recursive works. However, you can
     * also do a bottom-up DP without actually doing recursing. You can take
     * Fibonacci as an example. See CS Dojo.
     */
    public int minPathSum(int[][] grid) {
        return helper(grid, 0, 0);
    }

    private int helper(int[][] grid, int x, int y) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (x == rows - 1 && y == cols - 1) {
            return grid[x][y];
        }
        if (x >= rows || y >= cols) {
            return Integer.MAX_VALUE;
        }
        return grid[x][y] + Math.min(helper(grid, x + 1, y), helper(grid, x, y + 1));
    }
}