package com.rodionorets.leetcode.arrays;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        return searchInRoratedSortedArray(nums, 0, nums.length - 1, target);
    }

    private int searchInRoratedSortedArray(int[] array, int left, int right, int target) {
        if (left > right) return -1;

        int middle = (left + right) / 2;

        if (array[left] == target) return left;
        if (array[right] == target) return right;
        if (array[middle] == target) return middle;

        if (array[left] <= array[middle]) {
            if (array[left] < target && array[middle] > target) {
                return searchInRoratedSortedArray(array, left, middle - 1, target);
            } else {
                return searchInRoratedSortedArray(array, middle + 1, right, target);
            }
        } else {
            if (array[middle] < target && array[right] > target) {
                return searchInRoratedSortedArray(array, middle + 1, right, target);
            } else {
                return searchInRoratedSortedArray(array, left, middle - 1, target);
            }
        }
    }
}
