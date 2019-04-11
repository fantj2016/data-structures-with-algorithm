package com.gogostudy.leetcode.array;

/**
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * Created by Fant.J.
 * 2018/8/20 9:45
 */
public class 最长公共前缀 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(s);
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0){
                return "";
            }
            int index = 0;
            //拿出第一个字符串和后面的比较，有不同直接返回
            for (int i = 0;i<strs[0].length();i++){
                char current = strs[0].charAt(index);
                for (String str:strs){
                    if (str.length()== i || current!=str.charAt(i)){
                        return str.substring(0,index);
                    }
                }
                index++;
            }
            return strs[0].substring(0, index);
        }
    }
}
