package com.rodionorets.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!unique.add(nums[i])) return true;
        }

        return false;
    }
}
