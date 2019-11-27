package com.algorithm.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * Created by Fant.J.
 */
public class 回文数 {


    class Solution {
        public boolean isPalindrome(int x) {
            if (x<0 || (x!=0 && x%10==0)){
                return false;
            }
            int temp = 0;
            while (x>temp){
                int remainder = x%10;
                x /= 10;
                temp = temp *10 +remainder;
            }
            return x == temp/10 || x ==temp;
        }
    }
}
