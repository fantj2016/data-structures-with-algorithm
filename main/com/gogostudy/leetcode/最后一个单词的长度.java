package com.gogostudy.leetcode;

/**
 * Created by Fant.J.
 * 2018/8/22 16:49
 */
public class 最后一个单词的长度 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int hello_world = solution.lengthOfLastWord(" ");
        System.out.println(hello_world);
    }
    static class Solution {
        public int lengthOfLastWord(String s) {
            String[] split = s.split(" ");
            if (split.length ==0){
                return 0;
            }
            int length = split[split.length - 1].length();
            return length;
        }
    }
}
