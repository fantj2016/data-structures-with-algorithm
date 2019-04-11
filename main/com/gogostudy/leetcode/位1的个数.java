package com.gogostudy.leetcode;

/**
 * 思路就是给这个数一直除2，余数有一个1就代表有一个1 （这种解法会超时）
 *
 * :剑指offer的算法:不会超时
 */
public class 位1的个数 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int result = 0;
            while (n != 0) {
                n = n & (n - 1);
                result++;
            }
            return result;
        }
    }
}
