package com.algorithm.leetcode.array;

public class 买卖股票的最佳时机 {

    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 1){
                return 0;
            }
            //最小值
            int min = prices[0];
            //最大差值
            int maxProfit = 0;
            for (int i = 1;i<prices.length;i++){
                maxProfit = prices[i]-min > maxProfit?prices[i]-min:maxProfit;
                min = min < prices[i]?min:prices[i];
            }
            return maxProfit;
        }
    }
}
