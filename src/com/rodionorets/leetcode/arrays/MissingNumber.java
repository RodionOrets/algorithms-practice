package com.rodionorets.leetcode.arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int requiredSum = length * (length + 1) / 2;

        int actualSum = 0;
        for (int num : nums) actualSum += num;

        return requiredSum - actualSum;
    }
}
