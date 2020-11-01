package com.rodionorets.leetcode.bitmanipulation;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNumber ^= nums[i];
        }
        return singleNumber;
    }
}
