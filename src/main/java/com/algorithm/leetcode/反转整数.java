package com.algorithm.leetcode;

/**
 *
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * Created by Fant.J.
 * 2018/8/19 20:38
 */
public class 反转整数 {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int reverse = solution.reverse(1534236469);
//        System.out.println(reverse);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE/10);
        System.out.println(214748364*10+7);
        System.out.println(Integer.MIN_VALUE);
    }
    static class Solution {
        public int reverse(int x) {
            int temp = 0;
            while (x!=0) {
                int remainder = x % 10;
                x /= 10;
                //判断越界
                if (temp > Integer.MAX_VALUE/10 || (temp == Integer.MAX_VALUE / 10 && remainder > 7)) {
                    return 0;
                }
                if (temp < Integer.MIN_VALUE/10 || (temp == Integer.MIN_VALUE / 10 && remainder < -8)) {
                    return 0;
                }
                //乘以10+余数
                temp = temp * 10 + remainder;
            }
            return temp;
        }
    }
}
