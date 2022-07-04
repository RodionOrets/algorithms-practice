package com.rodionorets.leetcode.arrays.binarysearch.rotatedarray.iterative;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums[0] <= nums[nums.length - 1]) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int pivot = left + (right - left) / 2;

            if (nums[pivot] > nums[pivot + 1]) {
                return nums[pivot + 1];
            }

            if (nums[pivot] < nums[pivot - 1]) {
                return nums[pivot];
            }

            if (nums[pivot] > nums[0]) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }

        return -1;
    }

}
