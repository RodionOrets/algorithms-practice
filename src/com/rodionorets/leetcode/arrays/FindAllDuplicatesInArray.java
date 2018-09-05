package com.rodionorets.leetcode.arrays;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] presentElements = new boolean[nums.length + 1];
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (presentElements[nums[i]]) {
                duplicates.add(nums[i]);
            } else {
                presentElements[nums[i]] = true;
            }
        }

        return duplicates;
    }
}
