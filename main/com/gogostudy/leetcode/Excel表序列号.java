package com.gogostudy.leetcode;

public class Excel表序列号 {
    class Solution {
        public int titleToNumber(String s) {
            int num = 0;
            int pow = 1;
            for (int i = s.length()-1; i>=0; i--){
                num += (s.charAt(i) -'A' +1) *pow;
                pow *= 26;
            }
            return num;
        }
    }
}
