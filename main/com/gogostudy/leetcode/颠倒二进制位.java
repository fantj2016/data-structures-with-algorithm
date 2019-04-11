package com.gogostudy.leetcode;

public class 颠倒二进制位 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseBits(1000111001);
    }
    public static class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int result = 0;
            for (int i = 0; i< 32; i++, n >>= 1){
                System.out.println("n是:"+String.valueOf(n)+"      1&n是:"+String.valueOf(n&1) +"     result <<1 | (1 & n):"+String.valueOf(result <<1 | (1 & n)));
                result = result <<1 | (1 & n);
                System.out.println(result);
            }
            return result;
        }
    }
}
