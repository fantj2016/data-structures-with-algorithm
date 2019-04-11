package com.gogostudy.leetcode.array;

public class 买卖股票的最佳时机II {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            for (int i = 1;i< prices.length;i++){
                maxProfit += 0 > (prices[i] - prices[i-1]) ? 0: prices[i] - prices[i-1];
            }
            return maxProfit;
        }
    }
}
