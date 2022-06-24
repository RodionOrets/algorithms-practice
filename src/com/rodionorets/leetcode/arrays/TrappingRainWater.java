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
        
        int maxHeightIndex = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        
        int trappedWater = 0;
        
        int maxHeightToTheLeftOfTotalMaxHeight = heights[0];
        for (int i = 1; i < maxHeightIndex; i++) {
            if (heights[i] > maxHeightToTheLeftOfTotalMaxHeight) {
                maxHeightToTheLeftOfTotalMaxHeight = heights[i];
            } else {
                trappedWater += maxHeightToTheLeftOfTotalMaxHeight - heights[i];
            }
        }
        
        int maxHeightToTheRightOfTotalMaxHeight = heights[heights.length - 1];
        for (int i = heights.length - 2; i > maxHeightIndex; i--) {
            if (heights[i] > maxHeightToTheRightOfTotalMaxHeight) {
                maxHeightToTheRightOfTotalMaxHeight = heights[i];
            } else {
                trappedWater += maxHeightToTheRightOfTotalMaxHeight - heights[i];
            }
        }
        
        return trappedWater;
    }
}
