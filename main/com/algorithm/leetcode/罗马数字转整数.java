package com.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * Created by Fant.J.
 * 2018/8/20 8:37
 */
public class 罗马数字转整数 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("LVIII"));
    }
    static class Solution {
        public int romanToInt(String s) {
            Map<Character,Integer> map = new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int result = 0;
            char[] chars = s.toCharArray();
            for (int i = 0;i<chars.length;i ++){
                if (map.containsKey(chars[i])){
                    int value = map.get(chars[i]);
                    if ((i == chars.length - 1) || map.get(chars[i+1]) <= map.get(chars[i])) {
                        result += value;
                    } else {
                        result -= value;
                    }
                }
            }
            return result;
        }
    }
}
