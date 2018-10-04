package com.rodionorets.leetcode.arrays;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int numberOfArithmeticSlices = 0;
        int[] slicesCache = new int[A.length];

        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                slicesCache[i] = slicesCache[i - 1] + 1;
                numberOfArithmeticSlices += slicesCache[i];
            }
        }

        return numberOfArithmeticSlices;
    }
}
