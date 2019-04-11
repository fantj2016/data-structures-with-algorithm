package com.gogostudy.leetcode.array;

import java.util.Arrays;

/**
 * Created by Fant.J.
 * 2018/10/14 10:09
 */
public class 按奇偶排序数组II {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortArrayByParityII(new int[]{4,2,5,7});
    }
    static class Solution {
        public int[] sortArrayByParityII(int[] A) {
            Arrays.sort(A);
            int [] B = new int[A.length];
            //偶数个数
            int oushu = A.length /2;
            int oushuindex = 0;
            int jishuindex = 1;
            for (int i=0;i<A.length;i++){
                if (A[i] % 2 == 0){
                    for (int j = 0;j< oushu;j++){
                        B[oushuindex] = A[i];
                        if (oushuindex+2 <= A.length){
                            oushuindex += 2;
                        }
                        break;
                    }
                }else {
                    for (int j = 0;j< oushu;j++){
                        B[jishuindex] = A[i];
                        if (jishuindex+2 <= A.length){
                            jishuindex += 2;
                        }
                        break;
                    }
                }
            }
            return B;
        }
    }
}
