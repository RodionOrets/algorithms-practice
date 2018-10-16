package com.rodionorets.leetcode.arrays;

/*
Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
You may assume all four edges of the grid are surrounded by water.
Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.

Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.

Note: The length of each dimension in the given grid does not exceed 50.
* */

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return maxAreaOfIsland(grid, visited);
    }

    private int maxAreaOfIsland(int[][] grid, boolean[][] visited) {
        int maxAreaOfIsland = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    maxAreaOfIsland = Math.max(maxAreaOfIsland, getIslandArea(i, j, grid, visited));
                }
            }
        }

        return maxAreaOfIsland;
    }

    private int getIslandArea(int i, int j, int[][] grid, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) return 0;

        if (visited[i][j] || grid[i][j] == 0) return 0;

        int islandArea = 0;

        visited[i][j] = true;

        islandArea += 1;

        islandArea += getIslandArea(i - 1, j, grid, visited);
        islandArea += getIslandArea(i + 1, j, grid, visited);
        islandArea += getIslandArea(i, j - 1, grid, visited);
        islandArea += getIslandArea(i, j + 1, grid, visited);

        return islandArea;
    }
}
