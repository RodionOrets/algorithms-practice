package com.rodionorets.leetcode.arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int length = height.length;
        int indexFromBegin = 0;
        int indexFromEnd = length - 1;

        int area = 0;
        while (indexFromBegin < indexFromEnd) {
            if (height[indexFromBegin] < height[indexFromEnd]) {
                area = Math.max(area, height[indexFromBegin] * (indexFromEnd - indexFromBegin));
                indexFromBegin++;
            } else {
                area = Math.max(area, height[indexFromEnd] * (indexFromEnd - indexFromBegin));
                indexFromEnd--;
            }
        }

        return area;
    }
}
