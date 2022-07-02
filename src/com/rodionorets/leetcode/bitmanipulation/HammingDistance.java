package com.rodionorets.leetcode.bitmanipulation;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
* */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;

        String binaryXor = toStringBinary(xor);

        int hammingDistance = 0;

        for (int i = 0; i < binaryXor.length(); i++) {
            if (binaryXor.charAt(i) == '1') {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }

    private String toStringBinary(int num) {
        String binary = "";

        int remainingNum = num;
        while (remainingNum > 0) {
            int mod = remainingNum % 2;
            binary = mod + binary;
            remainingNum = remainingNum / 2;
        }

        return binary;
    }
}
