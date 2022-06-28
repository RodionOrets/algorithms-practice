package com.rodionorets.leetcode.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int num : nums) {
            frequencies.merge(num, 1, Integer::sum);
        }

        Queue<Integer> frequencyPrioritized
                = new PriorityQueue<>((item1, item2) -> Integer.compare(frequencies.get(item2), frequencies.get(item1)));

        frequencyPrioritized.addAll(frequencies.keySet());

        return frequencyPrioritized.stream()
                .limit(k)
                .collect(Collectors.toList());
    }
}
