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
        int[][] uniquePaths = new int[m][n];
        return uniquePaths(m , n, uniquePaths);
    }

    private int uniquePaths(int m, int n, int[][] uniquePaths) {
        if (m == 1 || n == 1) return 1;

        if (uniquePaths[m - 1][n - 1] != 0) return uniquePaths[m - 1][n - 1];

        int paths = uniquePaths(m - 1, n, uniquePaths) + uniquePaths(m, n - 1, uniquePaths);

        uniquePaths[m - 1][n - 1] = paths;

        return paths;
    }
}
