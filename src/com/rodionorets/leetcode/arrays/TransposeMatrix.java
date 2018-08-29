package com.rodionorets.leetcode.arrays;

public class TransposeMatrix {
    public int[][] transpose(int[][] originMatrix) {
        int originMatrixRowsNumber = originMatrix.length;
        int originMatrixColumnsNumber = originMatrix[0].length;

        int[][] transposedMatrix = new int[originMatrixColumnsNumber][originMatrixRowsNumber];

        for (int i = 0; i < originMatrixRowsNumber; i++) {
            for (int j = 0; j < originMatrixColumnsNumber; j++) {
                transposedMatrix[j][i] = originMatrix[i][j];
            }
        }

        return transposedMatrix;
    }
}
