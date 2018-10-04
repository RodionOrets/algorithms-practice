package com.rodionorets.leetcode.arrays;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] swappedCandies = new int[2];

        int aSum = sum(A);
        int bSum = sum(B);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if ((aSum - A[i] + B[j]) == (bSum - B[j] + A[i])) {
                    swappedCandies[0] = A[i];
                    swappedCandies[1] = B[j];
                }
            }
        }

        return swappedCandies;
    }

    private int sum(int[] nums) {
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        return sum;
    }
}
