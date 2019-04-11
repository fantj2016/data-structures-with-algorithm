package com.gogostudy.leetcode;

/**
 * Created by Fant.J.
 * 2018/8/24 9:58
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.climbStairs(5);
        System.out.println(i);
    }
    static class Solution {
        public int climbStairs(int n) {
            if(n <=1){
                return 1;
            }
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for(int i =2;i<n;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n-1];
        }
    }
}
