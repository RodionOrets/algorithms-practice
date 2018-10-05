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
        int gridLength = grid.length;

        int[] skylineFromTop = new int[gridLength];
        int[] skylineFromLeft = new int[gridLength];

        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridLength; j++) {
                skylineFromTop[j] = Math.max(skylineFromTop[j], grid[i][j]);
                skylineFromLeft[i] = Math.max(skylineFromLeft[i], grid[i][j]);
            }
        }

        int heightDifference = 0;

        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridLength; j++) {
                heightDifference += Math.min(skylineFromTop[j], skylineFromLeft[i]) - grid[i][j];
            }
        }

        return heightDifference;
    }
}
