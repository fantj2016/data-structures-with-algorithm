package com.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * Created by Fant.J.
 * 2018/10/14 10:26
 */
public class 使括号有效的最少添加 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minAddToMakeValid("())");
    }
    static class Solution {
        public int minAddToMakeValid(String S) {

            if (S.isEmpty()){
                return 0;
            }
            Stack<Character> stack = new Stack<>();
            int result = S.length();
            char [] chars = S.toCharArray();
            for (int i = 0;i<chars.length;i++){
                if (chars[i] == '('){
                    stack.push(')');
                }else if (!stack.isEmpty() && chars[i]==stack.pop()){
                    result -= 2;
                }
            }
            System.out.println(result);
            return result;
        }
    }
}
