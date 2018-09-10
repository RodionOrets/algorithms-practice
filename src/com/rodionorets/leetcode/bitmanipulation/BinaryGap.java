package com.rodionorets.leetcode.bitmanipulation;

public class BinaryGap {
    public int binaryGap(int N) {
        int prev = -1;
        int currentPosition = 0;
        int binaryGap = 0;
        while (N != 0) {
            if ((N & 1) == 1) {
                if (prev != -1) {
                    binaryGap = Math.max(binaryGap, currentPosition - prev);
                }
                prev = currentPosition;
            }
            currentPosition++;
            N >>= 1;
        }

        return binaryGap;
    }
}
