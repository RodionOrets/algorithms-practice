package com.rodionorets.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1) return intervals;

        intervals.sort(Comparator.comparingInt(a -> a.start));

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval lastInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval currentInterval = intervals.get(i);
            if (lastInterval.end < currentInterval.start) {
                mergedIntervals.add(lastInterval);
                lastInterval = currentInterval;
            } else {
                lastInterval = new Interval(lastInterval.start, Math.max(lastInterval.end, currentInterval.end));
            }
        }

        mergedIntervals.add(lastInterval);

        return mergedIntervals;
    }
}
