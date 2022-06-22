package com.rodionorets.leetcode.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> prioritizedByDescending
                = new PriorityQueue<>((one, another) -> Integer.compare(another, one));

        for (int i = 0; i < nums.length; i++) {
            prioritizedByDescending.add(nums[i]);
        }

        int kThLargest = 0;
        for (int i = 0; i < k; i++) {
            kThLargest = prioritizedByDescending.poll();
        }

        return kThLargest;
    }

}
