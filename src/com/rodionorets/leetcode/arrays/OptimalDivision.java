package com.rodionorets.leetcode.arrays;

public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        if (nums.length == 0) return "";
        if (nums.length == 1) return Integer.toString(nums[0]);
        if (nums.length == 2) return Integer.toString(nums[0]) + "/" + Integer.toString(nums[1]);

        StringBuilder optimalDivision = new StringBuilder();

        optimalDivision.append(Integer.toString(nums[0]));
        optimalDivision.append("/(");
        optimalDivision.append(Integer.toString(nums[1]));

        for (int i = 2; i < nums.length; i++) {
            optimalDivision
                    .append("/")
                    .append(nums[i]);
        }

        optimalDivision.append(")");

        return optimalDivision.toString();
    }
}
