package com.rodionorets.leetcode.arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysUntilWarmerTemperatures = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperature) {
                    daysUntilWarmerTemperatures[i] = j - i;
                    break;
                }
            }
        }

        return daysUntilWarmerTemperatures;
    }
}
