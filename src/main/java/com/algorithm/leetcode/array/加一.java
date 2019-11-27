package com.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * Created by Fant.J.
 * 2018/8/22 17:11
 */
public class 加一 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{8,9});
        Arrays.stream(ints).forEach(s-> System.out.println(s));
    }

    static class Solution {
//        public int[] plusOne(int[] digits) {
//            int n = digits.length;
//            for (int i = digits.length - 1; i >= 0; --i) {
//                if (digits[i] < 9) {
//                    ++digits[i];
//                    return digits;
//                }
//                digits[i] = 0;
//            }
//            int[] res = new int[n + 1];
//            res[0] = 1;
//            return res;
//        }
        int[] plusOne(int[] digits) {
            if (digits.length == 0) {
                return digits;
            }
            int carry = 1, n = digits.length;
            for (int i = digits.length - 1; i >= 0; --i) {
                if (carry == 0) {
                    return digits;
                }
                int sum = digits[i] + carry;
                //取余数
                digits[i] = sum % 10;
                //充值carry，如果没有进位。carry=0，否则carry=1
                carry = sum / 10;
            }
            int[] res = new int[n + 1];
            res[0] = 1;
            return carry == 0 ? digits : res;
        }
    }
}
