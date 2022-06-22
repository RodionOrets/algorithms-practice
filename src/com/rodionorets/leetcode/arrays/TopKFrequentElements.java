package com.rodionorets.leetcode.arrays;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            frequencies.merge(nums[i], 1, (frequency, one) -> frequency + one);
        }

        Queue<Integer> frequencyPrioritized
                = new PriorityQueue<>((item1, item2) -> Integer.compare(frequencies.get(item2), frequencies.get(item1)));

        frequencyPrioritized.addAll(frequencies.keySet());

        int[] topKFrequent = new int[k];
        for (int i = 0; i < topKFrequent.length; i++) {
            topKFrequent[i] = frequencyPrioritized.poll();
        }

        return topKFrequent;
    }
}
