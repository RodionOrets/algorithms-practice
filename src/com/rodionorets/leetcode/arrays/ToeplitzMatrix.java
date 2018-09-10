package com.rodionorets.leetcode.arrays;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        boolean[][] isToeplitz = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!isDiagonalContainsSameElements(matrix, visited, isToeplitz, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isDiagonalContainsSameElements(int[][] matrix, boolean[][] visited, boolean[][] isToeplitz, int r, int c) {
        if (visited[r][c]) {
            return isToeplitz[r][c];
        }

        int rowIterator = r;
        int columnIterator = c;

        int element = matrix[r][c];
        while (rowIterator < matrix.length && columnIterator < matrix[0].length) {
            visited[rowIterator][columnIterator] = true;
            isToeplitz[rowIterator][columnIterator] = matrix[rowIterator][columnIterator] == element;
            if (!isToeplitz[rowIterator][columnIterator]) {
                return false;
            }

            rowIterator++;
            columnIterator++;
        }

        return true;
    }
}
