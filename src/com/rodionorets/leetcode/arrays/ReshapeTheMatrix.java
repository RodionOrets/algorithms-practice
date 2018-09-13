package com.rodionorets.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int originRows = nums.length;
        int originColumns = nums[0].length;

        if (originRows * originColumns != r * c) {
            return nums;
        }

        int[][] newMatrix = new int[r][c];

        List<Integer> elements = new ArrayList<>();
        int newMatrixRow = 0;
        int newMatrixColumn = 0;
        for (int i = 0; i < originRows; i++) {
            for (int j = 0; j < originColumns; j++) {
                if (newMatrixRow >= r) {
                    return newMatrix;
                }

                if (newMatrixColumn >= c) {
                    newMatrixRow++;
                    newMatrixColumn = 0;
                }

                newMatrix[newMatrixRow][newMatrixColumn++] = nums[i][j];
            }
        }

        return newMatrix;
    }
}
