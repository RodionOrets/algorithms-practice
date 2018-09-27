package com.rodionorets.leetcode.arrays;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;

        int maxFromBegin = nums[0];
        int minFromEnd = nums[length - 1];

        int unsortedSubarrayBegin = -1;
        int unsortedSubarrayEnd = -2;

        int subarrayBegin;
        int subarrayEnd;

        for (int i = 1; i < length; i++) {
            subarrayBegin = i;
            subarrayEnd = length - i - 1;

            maxFromBegin = Math.max(maxFromBegin, nums[subarrayBegin]);
            minFromEnd = Math.min(minFromEnd, nums[subarrayEnd]);

            if (nums[subarrayBegin] < maxFromBegin) unsortedSubarrayEnd = subarrayBegin;
            if (nums[subarrayEnd] > minFromEnd) unsortedSubarrayBegin = subarrayEnd;
        }

        return unsortedSubarrayEnd - unsortedSubarrayBegin + 1;
    }
}
