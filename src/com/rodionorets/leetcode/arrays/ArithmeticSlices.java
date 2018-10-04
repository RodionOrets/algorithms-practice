package com.rodionorets.leetcode.arrays;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int numberOfArithmeticSlices = 0;

        for (int i = 0; i < A.length - 2; i++) {
            int diff = A[i + 1] - A[i];
            int runner = i + 2;
            while (runner < A.length && A[runner] - A[runner - 1] == diff) {
                numberOfArithmeticSlices += 1;
                runner++;
            }
        }

        return numberOfArithmeticSlices;
    }
}
