package com.rodionorets.leetcode.arrays;

/*
In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings).
Height 0 is considered to be a building as well.
At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid.
A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance.
What is the maximum total sum that the height of the buildings can be increased?
* */

public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] skylineFromTop = new int[grid.length];
        int[] skylineFromLeft = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int height = grid[i][j];
                if (height > skylineFromTop[j]) skylineFromTop[j] = height;
                if (height > skylineFromLeft[i]) skylineFromLeft[i] = height;
            }
        }

        int maxIncreaseKeepingSkylineSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int height = grid[i][j];
                maxIncreaseKeepingSkylineSum +=
                        Math.min(skylineFromTop[j], skylineFromLeft[i]) - height;
            }
        }

        return maxIncreaseKeepingSkylineSum;
    }
}
