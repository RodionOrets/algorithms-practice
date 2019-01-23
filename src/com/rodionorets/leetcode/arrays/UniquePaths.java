package com.rodionorets.leetcode.arrays;

public class UniquePaths {

    /*
    A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
    The robot can only move either down or right at any point in time.
    The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
    How many possible unique paths are there?
    Link: https://leetcode.com/problems/unique-paths
    * */

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for (int r = 0; r < m; r++) grid[r][0] = 1;
        for (int c = 0; c < n; c++) grid[0][c] = 1;

        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                grid[r][c] = grid[r - 1][c] + grid[r][c - 1];
            }
        }

        return grid[m - 1][n - 1];
    }
}
