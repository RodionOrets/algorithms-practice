package com.rodionorets.leetcode.arrays;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int n : nums) {
            frequencies.put(n, frequencies.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> frequencyOrdered
                = new PriorityQueue<>((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

        frequencyOrdered.addAll(frequencies.entrySet());

        List<Integer> topFrequentElements = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            topFrequentElements.add(frequencyOrdered.poll().getKey());
        }

        return topFrequentElements;
    }
}
