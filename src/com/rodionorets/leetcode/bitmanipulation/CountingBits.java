package com.rodionorets.leetcode.bitmanipulation;

public class CountingBits {
    public int[] countBits(int num) {
        int[] bitCounts = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            bitCounts[i] = bitCounts[i >> 1] + (i & 1);
        }

        return bitCounts;
    }
}
