package com.gogostudy.leetcode.array;

public class 增减字符串匹配 {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] res = new int[n + 1];
        int min = 0, max = n;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                res[i] = min++;
            } else {
                res[i] = max--;
            }
        }
        if (min != max) throw new RuntimeException("");
        res[n] = min;

        return res;
    }
}
