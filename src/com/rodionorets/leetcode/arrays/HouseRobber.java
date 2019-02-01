package com.rodionorets.leetcode.arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;

        int prev = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int next = Math.max(current, prev + nums[i]);
            prev = current;
            current = next;
        }

        return current;
    }
}
