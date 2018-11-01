package com.rodionorets.leetcode.arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productExceptSelf = new int[nums.length];

        if (nums.length == 0) return productExceptSelf;

        int sum = 1;

        for (int i = 0; i < nums.length; i++) {
            productExceptSelf[i] = sum;
            sum *= nums[i];
        }

        sum = 1;

        for (int i = productExceptSelf.length - 1; i >= 0; i--) {
            productExceptSelf[i] *= sum;
            sum *= nums[i];
        }

        return productExceptSelf;
    }
}
