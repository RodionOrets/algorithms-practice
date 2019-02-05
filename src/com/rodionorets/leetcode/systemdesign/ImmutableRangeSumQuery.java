package com.rodionorets.leetcode.systemdesign;

public class ImmutableRangeSumQuery {

    int[] accumulatedSums;

    public ImmutableRangeSumQuery(int[] nums) {
        if (nums.length > 0) {
            accumulatedSums = new int[nums.length];
            accumulatedSums[0] = nums[0];
            for (int i = 1; i < accumulatedSums.length; i++) {
                accumulatedSums[i] = accumulatedSums[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        int iSum = i == 0 ? 0 : accumulatedSums[i - 1];
        int jSum = accumulatedSums[j];
        return jSum - iSum;
    }

}
