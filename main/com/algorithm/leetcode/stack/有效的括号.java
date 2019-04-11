package com.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * Created by Fant.J.
 * 2018/8/20 10:29
 */
public class 有效的括号 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
    }


    static class Solution {
        public boolean isValid(String s) {
            if (s.isEmpty()){
                return true;
            }
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (int i = 0;i<chars.length;i++){
                if (chars[i] == '{'){
                    stack.push('}');
                }else if (chars[i] == '['){
                    stack.push(']');
                }else if (chars[i] == '('){
                    stack.push(')');
                }else if (stack.isEmpty() || chars[i]!=stack.pop()){
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
