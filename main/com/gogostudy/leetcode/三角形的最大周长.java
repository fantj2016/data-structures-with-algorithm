package com.gogostudy.leetcode;

import java.util.Arrays;

public class 三角形的最大周长 {
    public int largestPerimeter(int[] A) {
        // 对A进行排序
        Arrays.sort(A);
        for (int i = A.length-1; i>=2; i--){
            // 拿出后三个元素，看能否组成三角形,如果不行， 则最后一位数太大， 需要前移
            if (A[i]>= A[i-1]+A[i-2]){
                // 如果条件满足， 则需要前移
                continue;
            }else {
                return A[i]+A[i-1]+A[i-2];
            }
        }
        return 0;
    }
}
