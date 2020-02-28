package com.rodionorets.leetcode.arrays;

class FindFirstAndLastPositionInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            findFirstPosition(nums, target), 
            findLastPosition(nums, target)
        };
    }
    
    private int findFirstPosition(int[] nums, int target) {
        int position = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            }
        }
        
        return position;
    }
    
    private int findLastPosition(int[] nums, int target) {
        int position = -1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                position = i;
                break;
            }
        }
        
        return position;
    }
}
