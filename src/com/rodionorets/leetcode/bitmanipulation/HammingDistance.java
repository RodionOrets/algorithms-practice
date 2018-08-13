package com.rodionorets.leetcode.bitmanipulation;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
* */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;

        String binaryXor = toBinary(xor);

        int distance = 0;

        for (int i = 0; i < binaryXor.length(); i++) {
            if (binaryXor.charAt(i) == '1') {
                distance++;
            }
        }

        return distance;
    }

    private String toBinary(int x) {
        String binary = "";

        while (x > 0) {
            int mod = x % 2;
            binary = mod + binary;
            x = x / 2;
        }

        return binary;
    }
}
