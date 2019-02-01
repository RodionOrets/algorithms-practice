package com.rodionorets.leetcode.arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        return rob(nums, 0);
    }

    private int rob(int[] nums, int house) {
        if (house >= nums.length) return 0;
        return Math.max(rob(nums, house + 1), nums[house] + rob(nums, house + 2));
    }
}
