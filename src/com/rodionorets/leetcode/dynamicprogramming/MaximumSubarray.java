package com.rodionorets.leetcode.dynamicprogramming;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        
        int[] accumulatedSums = new int[length];
        accumulatedSums[0] = nums[0];
        
        int maxSum = accumulatedSums[0];
        for (int i = 1; i < length; i++) {
            accumulatedSums[i] = Math.max(nums[i], nums[i] + accumulatedSums[i - 1]);
            maxSum = Math.max(maxSum, accumulatedSums[i]);
        }
        
        return maxSum;
    }
}
