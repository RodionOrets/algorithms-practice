package com.rodionorets.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int expectedComplement = target - nums[i];
            if (complements.containsKey(expectedComplement)) {
                return new int[] {complements.get(expectedComplement), i};
            }
            complements.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
