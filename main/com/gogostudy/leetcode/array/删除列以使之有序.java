package com.gogostudy.leetcode.array;

public class 删除列以使之有序 {
    class Solution {
        public int minDeletionSize(String[] A) {
            int cnt = 0;
            for (int j = 0; j < A[0].length(); j++) {
                for (int i = 0; i < A.length - 1; i++) {
                    if (A[i].charAt(j) > A[i + 1].charAt(j)) {
                        cnt++;
                        break;
                    }
                }
            }
            return cnt;
        }
    }
}
