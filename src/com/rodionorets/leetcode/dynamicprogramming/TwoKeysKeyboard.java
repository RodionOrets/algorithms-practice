package com.rodionorets.leetcode.dynamicprogramming;

public class TwoKeysKeyboard {

    // TODO (1): Revisit with dynamic programming. Probably DP isn't a good choice for this problem, but on LeetCode it's in DP problems :P
    public int minSteps(int n) {
        int count = 1;

        int steps = 0;
        int buffer = 0;
        while (count != n) {
            if (n % count == 0) {
                buffer = count;
                steps++;
            }

            count += buffer;
            steps++;
        }

        return steps;
    }
}
