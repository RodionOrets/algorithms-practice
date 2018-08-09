package com.rodionorets.leetcode.arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        double requiredSum = (double)length / 2 * (length + 1);

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return (int)requiredSum - actualSum;
    }
}
