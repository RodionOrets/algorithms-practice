package com.rodionorets.leetcode.arrays;

public class TransponseMatrix {
    public int[][] transpose(int[][] A) {
        int rowsNumber = A.length;
        int columnsNumber = A[0].length;

        int[][] transponed = new int[columnsNumber][rowsNumber];

        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                transponed[j][i] = A[i][j];
            }
        }

        return transponed;
    }
}
