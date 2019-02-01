package com.rodionorets.leetcode.arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;

        int[] robbed = new int[nums.length + 1];

        robbed[0] = 0;
        robbed[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            robbed[i + 1] = Math.max(robbed[i], robbed[i - 1] + nums[i]);
        }

        return robbed[nums.length];
    }
}
