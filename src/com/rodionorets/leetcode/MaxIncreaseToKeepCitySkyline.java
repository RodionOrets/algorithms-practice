package com.rodionorets.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxIncreaseToKeepCitySkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        List<Integer> skylineFromLeft = new ArrayList<>();
        List<Integer> skylineFromTop = new ArrayList<>();

        int originGridSize = grid.length;

        for (int i = 0; i < originGridSize; i++) {
            skylineFromLeft.add(findMaxValue(grid[i]));
            int[] column = new int[originGridSize];
            for (int j = 0; j < originGridSize; j++) {
                column[j] = grid[j][i];
            }
            skylineFromTop.add(findMaxValue(column));
        }

        int heightDifference = 0;
        for (int i = 0; i < originGridSize; i++) {
            for (int j = 0 ; j < originGridSize; j++) {

            }
        }

        return heightDifference;
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];

        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

}
