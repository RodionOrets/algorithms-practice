package com.rodionorets.leetcode.arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        } else if (nums.length == 2) {
            moveZeroesIfLengthIsTwo(nums);
        } else {
            int slow = 0;
            int fast = 1;

            while (slow < nums.length && fast < nums.length) {
                if (nums[slow] != 0 && nums[fast] != 0) {
                    slow++;
                    fast++;
                } else if (nums[fast] == 0 && nums[slow] != 0) {
                    slow = fast;
                    fast++;
                } else if (nums[slow] == 0 && nums[fast] != 0) {
                    swap(nums, slow, fast);
                    slow++;
                    fast++;
                } else {
                    fast++;
                }
            }
        }
    }

    private void moveZeroesIfLengthIsTwo(int[] nums) {
        if (nums[0] == 0 && nums[1] != 0) {
            swap(nums, 0, 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
