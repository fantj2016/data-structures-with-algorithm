package com.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 连续差相同的数字 {
    public static void main(String[] args) {
        new Solution().numsSameConsecDiff(2, 1);
    }
    static class Solution {
        public int[] numsSameConsecDiff(int N, int K) {
            int[] nums = null;
            List<Integer> list = new ArrayList();
            for (int i = (int)Math.pow(10,N-1); i< Math.pow(10,N); i++){
                int flag = 1;
                for (int j=1;j<= N;j++){
                    if (Math.abs(i%(Math.pow(10,j)) - i/(Math.pow(10,j)))==K){
                        flag ++;
                    }
                    if (flag==N){
                        list.add(i);
                    }
                }
//                if (Math.abs(i%10 - i/10)==K){
//                    list.add(i);
//                }
//                if (Math.abs(i%10 - i/10)==K && Math.abs(i%100 - i/100)==K){
//                    list.add(i);
//                }
            }
            list.forEach(s-> System.out.println(s.toString()));
//            for (int i = 0;i< list.size();i++){
//                nums[i] = list.get(i);
//            }
            return null;
        }
    }
}
