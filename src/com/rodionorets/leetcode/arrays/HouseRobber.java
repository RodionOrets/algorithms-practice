package com.rodionorets.leetcode.arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        return rob(nums, 0, new int[nums.length]);
    }

    private int rob(int[] nums, int house, int robbed[]) {
        if (house >= nums.length) return 0;
        if (robbed[house] > 0) return robbed[house];
        int rob = Math.max(rob(nums, house + 1, robbed), nums[house] + rob(nums, house + 2, robbed));
        robbed[house] = rob;
        return rob;
    }
}
