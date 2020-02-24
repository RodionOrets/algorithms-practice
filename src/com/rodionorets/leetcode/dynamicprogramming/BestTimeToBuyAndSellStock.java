package com.rodionorets.leetcode.dynamicprogramming;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int maxProfit = 0;
        int minimumPrice = prices[0];
        
        for (int day = 1; day < prices.length; day++) {
            if (prices[day] < minimumPrice) {
                minimumPrice = prices[day];
            } else {
                maxProfit = Math.max(maxProfit, prices[day] - minimumPrice);
            }
        }
        
        return maxProfit;
    }
}
