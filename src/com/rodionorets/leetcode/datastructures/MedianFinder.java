package com.rodionorets.leetcode.datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    private final PriorityQueue<Integer> minHeapOnLeft;
    private final PriorityQueue<Integer> maxHeapOnRight;

    public MedianFinder() {
        minHeapOnLeft = new PriorityQueue<>(Comparator.naturalOrder());
        maxHeapOnRight = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (minHeapOnLeft.size() == 0 || num < minHeapOnLeft.peek()) {
            maxHeapOnRight.offer(num);
        } else {
            minHeapOnLeft.offer(num);
        }

        rebalance();
    }

    public double findMedian() {
        return minHeapOnLeft.size() == maxHeapOnRight.size()
                ? (minHeapOnLeft.peek() + maxHeapOnRight.peek()) / 2.0
                : maxHeapOnRight.peek();
    }

    private void rebalance() {
        if (minHeapOnLeft.size() > maxHeapOnRight.size()) {
            Integer peakFromLeft = minHeapOnLeft.poll();
            maxHeapOnRight.offer(peakFromLeft);
        }

        if (maxHeapOnRight.size() > minHeapOnLeft.size() + 1) {
            Integer peakFromRight = maxHeapOnRight.poll();
            minHeapOnLeft.offer(peakFromRight);
        }
    }

}
