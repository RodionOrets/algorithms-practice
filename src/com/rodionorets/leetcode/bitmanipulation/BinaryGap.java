package com.rodionorets.leetcode.bitmanipulation;

public class BinaryGap {
    public int binaryGap(int n) {
        int prev = -1;
        int currentPosition = 0;
        int binaryGap = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (prev != -1) {
                    binaryGap = Math.max(binaryGap, currentPosition - prev);
                }
                prev = currentPosition;
            }
            currentPosition++;
            n >>= 1;
        }

        return binaryGap;
    }
}
