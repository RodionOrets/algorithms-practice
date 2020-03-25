package com.rodionorets.leetcode.arrays;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int resultIterator = 0;
        int runnerIterator = 1;
        while (runnerIterator < nums.length) {
            if (nums[resultIterator] != nums[runnerIterator]) {
                resultIterator++;
                nums[resultIterator] = nums[runnerIterator];
            }
            runnerIterator++;
        }
        return resultIterator + 1;
    }
}
