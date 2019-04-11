package com.gogostudy.leetcode.array;

public class 有效的山脉数组 {
    /**
     * A.length >= 3
     * 在 0 < i < A.length - 1 条件下，存在 i 使得：
     * A[0] < A[1] < ... A[i-1] < A[i]
     * A[i] > A[i+1] > ... > A[B.length - 1]
     */
    class Solution {
        public boolean validMountainArray(int[] A) {
            if (A.length < 3){
                return false;
            }

            int max = A[0];
            int index = 0;
            for (int i = 1; i< A.length; i++){
//                max = max > A[i]? max: A[i];
                if (A[i]>max){
                    max = A[i];
                }else if (A[i] < max){
                    //到了顶峰:拿到索引，后面的数字必须全小
                    index = i-1;
                    break;
                }else {
                    break;
                }
            }
            if (index == 0){
                return false;
            }
            for (int i = index+1; i< A.length; i++){
                if (A[i]<A[i-1]){
                    //do nothing
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        }
    }
}
