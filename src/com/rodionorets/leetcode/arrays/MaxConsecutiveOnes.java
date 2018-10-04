package com.rodionorets.leetcode.arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;

        int consecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            consecutiveOnes = nums[i] == 1 ? consecutiveOnes + 1 : 0;
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
        }

        return maxConsecutiveOnes;
    }
}
