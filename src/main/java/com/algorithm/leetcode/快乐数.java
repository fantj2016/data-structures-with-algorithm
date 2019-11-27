package com.algorithm.leetcode;

public class 快乐数 {
    public static void main(String[] args) {
        new Solution().isHappy(1998);
    }

    static class Solution {
        public boolean isHappy(int n) {
            int num = 0;
            if (n == 1) {
                return true;
            }
            if (n == 0 || n == 4) {
                return false;
            }
            while (true) {
                num += (n % 10) * (n % 10);
                n /= 10;
                if (n == 0) {
                    break;
                }
            }
            return isHappy(num);
        }
    }
}
