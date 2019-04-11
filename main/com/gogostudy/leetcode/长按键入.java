package com.gogostudy.leetcode;

/**
 * @Author Fant.J
 * @Date 2018/10/21 9:45
 * @Description none
 **/
public class 长按键入 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean longPressedName = solution.isLongPressedName("pyplrz", "ppyypllr");
        System.out.println(longPressedName);

    }
    static class Solution {
        public boolean isLongPressedName(String name, String typed) {
            char[] achars = typed.toCharArray(); //长
            char[] bchars = name.toCharArray();  //短
            if (achars[0] != bchars[0]){
                return false;
            }
            if (achars[achars.length-1] != bchars[bchars.length-1]){
                return false;
            }
            int index = 1;
            for (int i = 1; i< achars.length; i++){
                //如果两个相等，则两个index++
                //如果两者不等，则需要判断 长串是否和自己的上一位 相等，如果不相等，则返回false，如果相等，index++
                //如果a已经遍历完，则返回false
                if (achars[i] == bchars[index]){
                    if (index == bchars.length-1){
                        return true;
                    }else if (i != achars.length-1){
                        index++;
                        continue;
                    }else {
                        return false;
                    }
                }else {
                    if (achars[i] != achars[i-1]){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
