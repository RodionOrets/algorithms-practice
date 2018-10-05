package com.rodionorets.leetcode.arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int front = 0;
        int back = nums.length - 1;

        while(front < back) {
            if (nums[back] % 2 == 0 && nums[front] % 2 != 0) {
                swap(nums, front, back);
                front++;
                back--;
            } else if (nums[front] % 2 == 0) {
                front++;
            } else if (nums[back] % 2 != 0) {
                back--;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
