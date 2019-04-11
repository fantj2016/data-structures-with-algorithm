package com.gogostudy.leetcode;

public class Excel表列名称 {
    class Solution {
        public String convertToTitle(int n) {
            String res = "";
            while (n > 0) {
                res = (char)('A' + (--n) % 26) + res;
                n /= 26;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println( (char)('A'+1) +"B" );
    }
}
