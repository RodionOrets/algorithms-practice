package com.rodionorets.leetcode.arrays;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        return invert(flip(A));
    }

    private int[][] flip(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int frontIndex = 0;
            int backIndex = A[i].length - 1;

            while (frontIndex < backIndex) {
                int temp = A[i][frontIndex];
                A[i][frontIndex] = A[i][backIndex];
                A[i][backIndex] = temp;

                frontIndex++;
                backIndex--;
            }
        }

        return A;
    }

    private int[][] invert(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                }
                else if (A[i][j] == 1) {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }
}
