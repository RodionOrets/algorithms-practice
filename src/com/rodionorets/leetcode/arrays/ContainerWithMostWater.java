package com.rodionorets.leetcode.arrays;

/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2.
* */

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int distance = right - left;
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int area = distance * Math.min(leftHeight, rightHeight);
            maxArea = Math.max(maxArea, area);

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
