package com.rodionorets.leetcode.arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productsExceptSelf = new int[nums.length];
        int[] productsToTheLeft = new int[nums.length];
        int[] productsToTheRight = new int[nums.length];
        
        for (int i = 0; i < productsToTheLeft.length; i++) {
            productsToTheLeft[i] = i == 0 
                ? 1 
                : productsToTheLeft[i - 1] * nums[i - 1];
        }
        
        for (int i = productsToTheRight.length - 1; i >= 0; i--) {
            productsToTheRight[i] = i == productsToTheRight.length - 1 
                ? 1 
                : productsToTheRight[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < productsExceptSelf.length; i++) {
            productsExceptSelf[i] = productsToTheLeft[i] * productsToTheRight[i];
        }
        
        return productsExceptSelf;
    }
}
