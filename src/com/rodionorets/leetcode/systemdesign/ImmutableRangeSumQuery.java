package com.rodionorets.leetcode.systemdesign;

public class ImmutableRangeSumQuery {

    private int[] numArray;

    private int[] accumulatedSums;

    public ImmutableRangeSumQuery(int[] nums) {
        if (nums.length > 0) {
            numArray = new int[nums.length];
            System.arraycopy(nums, 0, numArray, 0, nums.length);
            accumulateSums();
        }
    }

    public int sumRange(int i, int j) {
        int iSum = i == 0 ? 0 : accumulatedSums[i - 1];
        int jSum = accumulatedSums[j];
        return jSum - iSum;
    }

    private void accumulateSums() {
        accumulatedSums = new int[numArray.length];
        accumulatedSums[0] = numArray[0];
        for (int i = 1; i < accumulatedSums.length; i++) {
            accumulatedSums[i] = accumulatedSums[i - 1] + numArray[i];
        }
    }
}
