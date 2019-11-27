package com.algorithm.leetcode;

/**
 * Created by Fant.J.
 */
public class 二进制求和 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.addBinary("0", "0");
        System.out.println(s);
    }

    static class Solution {
        /*       public String addBinary(String a, String b) {
         */

        /**
         * 输入: a = "11", b = "1"
         * 输出: "100"
         * 输入: a = "1010", b = "1011"
         * 输出: "10101"
         *//*
            int alength=a.length();
            int blength=b.length();
            String result="";
            int sum =0;
            while(alength>=1||blength>=1){
                if(alength>=1){
                    sum+=Integer.parseInt(a.substring(alength-1,alength));
                    alength--;
                }
                if(blength>=1){
                    sum+=Integer.parseInt(b.substring(blength-1,blength));
                    blength--;
                }
                //如果sum=2，证明两字符串最后一位都是1
                if(sum==2){
                    result="0"+result;
                    sum=1;
                }else if(sum==3){
                    result="1"+result;
                    sum=1;
                }else{
                    result=sum+""+result;
                    sum=0;
                }
            }
            if(sum==1){
                result="1"+result;
            }
            return result;
        }*/
        public String addBinary(String a, String b) {
            int i = a.length() - 1,
                    j = b.length() - 1,
                    sum = 0;
            StringBuilder sb = new StringBuilder();
            while (i >= 0 || j >= 0) {
                int m = i >= 0 ? a.charAt(i) - '0' : 0;
                int n = j >= 0 ? b.charAt(j) - '0' : 0;
                sum += m + n;
                if(sum==2){
                    sb.insert(0, "0");
                    sum=1;
                }else if(sum==3){
                    sb.insert(0, "1");
                    sum=1;
                }else{
                    sb.insert(0, String.valueOf(sum));
                    sum=0;
                }
                i--;
                j--;
            }
            if (sum == 1) {
                sb.insert(0, "1");
            }
            return sb.toString();
        }
    }
}
