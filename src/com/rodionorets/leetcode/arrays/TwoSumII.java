package com.rodionorets.leetcode.arrays;

public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int sumCandidate = nums[low] + nums[high];
            if (sumCandidate == target) {
                return new int[] {low + 1, high + 1};
            } else if (sumCandidate > target) {
                high--;
            } else if (sumCandidate < target) {
                low++;
            }
        }

        return new int[] {-1, -1};
    }
}
