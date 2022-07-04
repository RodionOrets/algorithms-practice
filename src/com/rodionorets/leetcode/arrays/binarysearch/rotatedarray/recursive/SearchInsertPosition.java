package com.rodionorets.leetcode.arrays.binarysearch.rotatedarray.recursive;

/*
Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.

Example 1:
Input: [1,3,5,6], 5
Output: 2

Example 2:
Input: [1,3,5,6], 2
Output: 1

Example 3:
Input: [1,3,5,6], 7
Output: 4

Example 4:
Input: [1,3,5,6], 0
Output: 0
* */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int from, int to, int target) {
        if (from > to) {
            return from;
        }

        int middle = (from + to) / 2;

        if (nums[middle] == target) return middle;

        return target < nums[middle]
                ? search(nums, from, middle - 1, target)
                : search(nums, middle + 1, to, target);
    }
}
