package com.rodionorets.leetcode.arrays;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int numberOfArithmeticSlices = 0;
        int lastArithmeticSlicesCount = 0;

        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                lastArithmeticSlicesCount += 1;
                numberOfArithmeticSlices += lastArithmeticSlicesCount;
            } else {
                lastArithmeticSlicesCount = 0;
            }
        }

        return numberOfArithmeticSlices;
    }
}
