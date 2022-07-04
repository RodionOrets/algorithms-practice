package com.rodionorets.leetcode.arrays.binarysearch.rotatedarray.recursive;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    private int findMin(int[] nums, int from, int to) {
        if (nums[from] == nums[to]) return nums[from];
        if (nums[from] < nums[to]) return nums[from];

        int middle = from + (to - from) / 2;

        if (nums[middle + 1] < nums[middle]) {
            return nums[middle + 1];
        }

        if (nums[middle] < nums[middle - 1]) {
            return nums[middle];
        }

        return nums[middle] < nums[to]
                ? findMin(nums, from, middle - 1)
                : findMin(nums, middle + 1, to);
    }

}
