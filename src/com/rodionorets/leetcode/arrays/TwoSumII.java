package com.rodionorets.leetcode.arrays;

public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int expectedComplement = target - nums[i];
            int complementIndex = search(nums, i + 1, nums.length - 1, expectedComplement);
            if (complementIndex != -1) {
                indices[0] = i + 1;
                indices[1] = complementIndex + 1;
                break;
            }
        }

        return indices;
    }

    private int search(int[] nums, int from, int to, int target) {
        while (from <= to) {
            int middle = (to + from) / 2;
            if (nums[middle] == target) return middle;
            else if (target < nums[middle]) to = middle - 1;
            else if (target > nums[middle]) from = middle + 1;
        }

        return -1;
    }
}
