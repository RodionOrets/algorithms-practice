package com.rodionorets.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxIncreaseToKeepCitySkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int gridLength = grid[0].length;
        int[] skylineFromLeft = new int[gridLength];
        int[] skylineFromTop = new int[gridLength];

        int originGridCellValue;
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridLength; j++) {
                originGridCellValue = grid[i][j];
                if (originGridCellValue > skylineFromTop[j]) {
                    skylineFromTop[j] = originGridCellValue;
                }

                if (originGridCellValue > skylineFromLeft[i]) {
                    skylineFromLeft[i] = originGridCellValue;
                }
            }
        }

        int heightDifference = 0;
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0 ; j < gridLength; j++) {
                originGridCellValue = grid[i][j];
                heightDifference += Math.min(skylineFromTop[j], skylineFromLeft[i]) - originGridCellValue;
            }
        }

        return heightDifference;
    }
}
