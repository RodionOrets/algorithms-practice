package com.rodionorets.leetcode.arrays;

import java.util.Arrays;

public class MinMovesToEqualArrayElements {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int minMoves = 0;

        int medianIndex = (nums.length - 1) / 2;

        int median = nums[medianIndex];

        for (int i = 0; i < nums.length; i++) {
            if (i != medianIndex) {
                minMoves += Math.abs(nums[i] - median);
            }
        }

        return minMoves;
    }
}
