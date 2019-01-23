package com.rodionorets.leetcode.arrays;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] grid) {
        if (grid[0][0] == 1) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        grid[0][0] = 1;

        for (int r = 1; r < rows; r++) grid[r][0] = (grid[r][0] == 0 && grid[r - 1][0] == 1) ? 1 : 0;
        for (int c = 1; c < cols; c++) grid[0][c] = (grid[0][c] == 0 && grid[0][c - 1] == 1) ? 1 : 0;

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (grid[r][c] == 0) {
                    grid[r][c] = grid[r - 1][c] + grid[r][c - 1];
                } else {
                    grid[r][c] = 0;
                }
            }
        }

        return grid[rows - 1][cols - 1];
    }
}
