package problems1To100.problem64;
class Solution {
    public int minPathSum(int[][] grid) {
        Integer[][] dp = new Integer[grid.length][grid[0].length];
        return minPathSum(grid, 0, 0, dp);
    }

    private int minPathSum(int[][] grid, int i, int j, Integer[][] dp) {
        if(i == grid.length - 1 && j == grid[0].length - 1) 
            return grid[i][j];
        
        if(dp[i][j] != null)
            return dp[i][j];

        Integer rightSum = null;
        Integer downSum = null;

        Integer curr = grid[i][j];

        if(i < grid.length-1)
            downSum = minPathSum(grid, i + 1, j, dp);
        if(j < grid[0].length-1)
            rightSum = minPathSum(grid, i, j + 1, dp);
        
        Integer sum = curr + Math.min(downSum == null ? Integer.MAX_VALUE : downSum, rightSum == null ? Integer.MAX_VALUE : rightSum);

        dp[i][j] = sum;
        return sum;
    }
}