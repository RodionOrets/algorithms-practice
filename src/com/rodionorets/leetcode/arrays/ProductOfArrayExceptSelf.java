package com.rodionorets.leetcode.arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] productsExceptSelf = new int[length];
        int[] productsFromLeftToRight = new int[length];
        int[] productsFromRightToLeft = new int[length];

        productsFromLeftToRight[0] = 1;
        for (int i = 1; i < length; i++) {
            productsFromLeftToRight[i] = productsFromLeftToRight[i - 1] * nums[i - 1];
        }

        productsFromRightToLeft[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            productsFromRightToLeft[i] = productsFromRightToLeft[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            productsExceptSelf[i] = productsFromLeftToRight[i] * productsFromRightToLeft[i];
        }

        return productsExceptSelf;
    }
}
