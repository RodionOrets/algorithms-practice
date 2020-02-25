class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int maxProfit = 0;
        for (int day = 1; day < prices.length; day++) {
            if (prices[day] > prices[day - 1]) {
                maxProfit += prices[day] - prices[day - 1];
            }
        }
        
        return maxProfit;
    }
}
