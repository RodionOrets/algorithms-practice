package com.rodionorets.leetcode.arrays;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) return true;
        return nums[nums.length - 1] <= nums[0]
                ? isMonotoneDecreasing(nums)
                : isMonotoneIncreasing(nums);
    }

    private boolean isMonotoneDecreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) return false;
        }

        return true;
    }

    private boolean isMonotoneIncreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) return false;
        }

        return true;
    }
}
