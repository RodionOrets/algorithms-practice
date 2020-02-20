package com.rodionorets.leetcode.arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        int[] toTransfer = new int[k];
        
        for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
            toTransfer[j] = nums[i];
        }
                
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        
        for (int i = 0; i < toTransfer.length; i++) {
            nums[i] = toTransfer[i];
        }
    }
}
