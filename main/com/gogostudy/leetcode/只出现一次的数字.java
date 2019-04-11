package com.gogostudy.leetcode;

/**
 * @Author Fant.J
 * @Date 2018/10/21 8:48
 * @Description none
 **/
public class 只出现一次的数字 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.singleNumber(new int[]{4,1,2,1,2});
    }
    static class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num:nums){
                result ^= num;
            }
            return result;
        }
    }
}

