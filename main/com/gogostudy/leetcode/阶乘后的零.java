package com.gogostudy.leetcode;

public class 阶乘后的零 {
    static class Solution {
//        public int trailingZeroes(int n) {
//            int jiecheng = jiecheng(n);
//            int result = 0;
//            String s = String.valueOf(jiecheng);
//            for (int i = s.length()-1; i>=0; i--){
//                if (s.charAt(i) == 0){
//                    ++result;
//                }else {
//                    break;
//                }
//            }
//            return result;
//        }
//        public int jiecheng(int n){
//            if (n==1 ||n == 0){
//                return 1;
//            }
//            return n*jiecheng(n-1);
//        }
        public int trailingZeroes(int n){
            int count=0;
            while (n!=0) {     //count the number of factor 5;
                count+=n/5;
                n/=5;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.trailingZeroes(3);
        System.out.println(i);
    }
}
