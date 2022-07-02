package com.rodionorets.leetcode.arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;

        int consecutiveOnes = 0;
        for (int num : nums) {
            consecutiveOnes = num == 1 ? consecutiveOnes + 1 : 0;
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
        }

        return maxConsecutiveOnes;
    }
}
