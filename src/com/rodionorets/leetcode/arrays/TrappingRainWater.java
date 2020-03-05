package com.rodionorets.leetcode.arrays;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

|              _
|      _      | |_   _
|  _  | |w w w|   |w| |_
|_| |w|   |w|           |
w - water
* */

public class TrappingRainWater {
    public int trap(int[] heights) {
        if (heights.length <= 2) return 0;
        
        int maxIndex = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        
        int trappedWater = 0;
        
        int leftMax = heights[0];
        for (int i = 1; i < maxIndex; i++) {
            if (heights[i] > leftMax) {
                leftMax = heights[i];
            } else {
                trappedWater += leftMax - heights[i];
            }
        }
        
        int rightMax = heights[heights.length - 1];
        for (int i = heights.length - 2; i > maxIndex; i--) {
            if (heights[i] > rightMax) {
                rightMax = heights[i];
            } else {
                trappedWater += rightMax - heights[i];
            }
        }
        
        return trappedWater;
    }
}
