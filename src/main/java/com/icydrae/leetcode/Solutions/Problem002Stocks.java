package com.icydrae.leetcode.Solutions;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class Problem002Stocks {
    public int maxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int maxSellPrice = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            }

            int currentProfit = prices[i] - minBuyPrice;

            if (currentProfit > maxSellPrice) {
                maxSellPrice = currentProfit;
            }
        }

        return maxSellPrice;
    }
}
