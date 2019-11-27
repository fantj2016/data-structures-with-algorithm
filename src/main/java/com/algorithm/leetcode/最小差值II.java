package com.algorithm.leetcode;

import java.util.Arrays;

/**
 * Created by Fant.J.
 * 2018/9/23 9:47
 */
public class 最小差值II {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.smallestRangeII(new int[]{4,1,8,10}, 3);
        System.out.println(i);
    }
    static class Solution {
        public int smallestRangeII(int[] A, int K) {
            Arrays.sort(A);
            int n = A.length;
            int ans = A[n-1]-A[0];
            int min = A[0]-K;
            int max = A[n-1]-K;
            for (int i = 0; i < n-1; i++) {
                min = Math.min(A[i+1]-K, A[0]+K);
                max = Math.max(max, A[i]+K);
                ans = Math.min(ans, max-min);
            }
            return ans;
        }
    }
}
