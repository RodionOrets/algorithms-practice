package com.rodionorets.leetcode.arrays;

public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int nestedArraySize = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                int current = nums[i];
                int size = 0;
                while (nums[current] != -1) {
                    int old = current;
                    current = nums[current];
                    size += 1;
                    nums[old] = -1;
                }
                nestedArraySize = Math.max(nestedArraySize, size);
            }
        }

        return nestedArraySize;
    }
}
