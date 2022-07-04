package com.rodionorets.leetcode.arrays.binarysearch.rotatedarray.recursive;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int from, int to, int target) {
        if (from > to) return -1;

        int middle = from + (to - from) / 2;

        if (nums[from] == target) return from;
        if (nums[middle] == target) return middle;
        if (nums[to] == target) return to;

        if (nums[from] <= nums[middle]) {
            if (nums[from] < target && nums[middle] > target) {
                return search(nums, from, middle - 1, target);
            } else {
                return search(nums, middle + 1, to, target);
            }
        } else {
            if (nums[middle] < target && nums[to] > target) {
                return search(nums, middle + 1, to, target);
            } else {
                return search(nums, from, middle - 1, target);
            }
        }
    }
}
