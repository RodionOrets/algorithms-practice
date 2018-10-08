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
        int trappedWater = 0;

        int left = 0;
        int right = heights.length - 1;

        int leftMaximumHeight = 0;
        int rightMaximumHeight = 0;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];

            leftMaximumHeight = Math.max(leftHeight, leftMaximumHeight);
            rightMaximumHeight = Math.max(rightHeight, rightMaximumHeight);

            if (leftHeight < rightHeight) {
                trappedWater += leftMaximumHeight - leftHeight;
                left++;
            } else {
                trappedWater += rightMaximumHeight - rightHeight;
                right--;
            }
        }

        return trappedWater;
    }
}
