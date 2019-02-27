package com.rodionorets.leetcode.dynamicprogramming;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] combinations = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            combinations[i] = amount + 1;
            for (int coin : coins) {
                if (coin <= i) {
                    combinations[i] = Math.min(combinations[i], combinations[i - coin] + 1);
                }
            }
        }

        return combinations[amount] > amount ? -1 : combinations[amount];
    }
}
