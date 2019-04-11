package com.gogostudy.leetcode;

/**
 * Created by Fant.J.
 * 2018/9/23 9:47
 */
public class 最小差值I {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.smallestRangeI(new int[]{0,10}, 2);
        System.out.println(i);
    }
    static class Solution {
        public int smallestRangeI(int[] A, int K) {
            if (A.length==1){
                return 0;
            }
            int max = 0;
            for (int i=0;i<A.length;i++){
                for (int j = 0;j<i;j++){
                    int temp = Math.abs(A[j]-A[i]);
                    if (temp > max){
                        max = temp;
                    }
                }
            }
            if (max <= 2*K){
                return 0;
            }else {
                return max-2*K;
            }
        }
    }
}
