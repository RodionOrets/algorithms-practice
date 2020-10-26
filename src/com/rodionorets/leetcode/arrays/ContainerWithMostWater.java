package com.rodionorets.leetcode.arrays;

/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2.
* */

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int leftPosition = 0;
        int rightPosition = heights.length - 1;
        while (leftPosition < rightPosition) {
            int left = heights[leftPosition];
            int right = heights[rightPosition];
            int area = Math.min(left, right) * (rightPosition - leftPosition);
            maxArea = Math.max(maxArea, area);
            
            if (left < right) {
                leftPosition++;
            } else {
                rightPosition--;
            }
        }
        
        return maxArea;
    }
}
