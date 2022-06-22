package com.rodionorets.leetcode.dynamicprogramming;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSubArraySum = nums[0];
        int maxSumOnPreviousStep = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSumOnPreviousStep = Math.max(nums[i], nums[i] + maxSumOnPreviousStep);
            maxSubArraySum = Math.max(maxSubArraySum, maxSumOnPreviousStep);
        }

        return maxSubArraySum;
    }
}
