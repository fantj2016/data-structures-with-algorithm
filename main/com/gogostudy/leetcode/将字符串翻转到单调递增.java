package com.gogostudy.leetcode;

/**
 * @Author Fant.J
 * @Date 2018/10/21 10:21
 * @Description none
 **/

/**
 * 未完成
 */
public class 将字符串翻转到单调递增 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.minFlipsMonoIncr("010110");
        System.out.println(i);
    }
    static class Solution {
        public int minFlipsMonoIncr(String S) {
            //从第一个变数开始
            //计算 从该数起后面 0 的个数和 1的个数 ，这两个数谁小就返回谁
            char[] chars = S.toCharArray();
            int index0 = 0;
            int index1 = 0;
            int temp = 0;
            //前两位不相等，就倒序遍历，取最大
            if (chars.length >2 && chars[0] != chars[1] && chars[chars.length-1]==chars[chars.length-2]){
                for (int i = chars.length-1;i>0;i--){
                    if (chars[i] != chars[i-1]){
                        temp = i-1;
                        break;
                    }
                }
                for (int i = temp;i>0;i--){
                    if (chars[i] == '0'){
                        index0 ++;
                    }else {
                        index1 ++;
                    }
                }
//                return index0>index1?index0:index1;
                return index1;
            }else {
                for (int i = 1; i < chars.length; i++) {
                    if (chars[i] != chars[i - 1]) {
                        System.out.println(i);
                        //从这里开始分别计数1和0 的个数
                        temp = i;
                        break;
                    }
                }
                for (int j = temp; j < chars.length; j++) {
                    if (chars[j] == '0') {
                        index0++;
                    } else {
                        index1++;
                    }
                }
                //如果 1 比0 多，则从后开始将 0 变1(计算从)
                if (index1 > index0) {

                }
                System.out.println("index0:" + index0 + ";index1:" + index1);
                return index0 < index1 ? index0 : index1;
            }
        }
    }
}
