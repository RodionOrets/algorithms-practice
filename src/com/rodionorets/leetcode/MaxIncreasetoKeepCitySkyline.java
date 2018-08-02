package com.rodionorets.leetcode;

public class MaxIncreasetoKeepCitySkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int size = grid[0].length;

        int[] skylineFromLeft = new int[4];
        for (int i = 0; i < size; i++) {
            int maxFromRow = findMaxValue(grid[i]);
            skylineFromLeft[i] = maxFromRow;

            for (int j = 0; j < size; j++) {

            }
        }

        int overallHeightDifference = 0;

        return overallHeightDifference;
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
