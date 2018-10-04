package com.rodionorets.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceBars, int[] bobBars) {
        int[] swappedCandies = new int[2];

        int aliceBarsSum = sum(aliceBars);
        int bobBarsSum = sum(bobBars);

        int requiredBarsExchangeAmount = (bobBarsSum - aliceBarsSum) / 2;

        Set<Integer> bobBarsSet = new HashSet<>();
        for (int bobBar : bobBars) bobBarsSet.add(bobBar);

        for (int aliceBar : aliceBars) {
            if (bobBarsSet.contains(aliceBar + requiredBarsExchangeAmount)) {
                swappedCandies[0] = aliceBar;
                swappedCandies[1] = aliceBar + requiredBarsExchangeAmount;
            }
        }

        return swappedCandies;
    }

    private int sum(int[] nums) {
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        return sum;
    }
}
