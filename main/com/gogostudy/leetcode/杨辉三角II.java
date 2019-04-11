package com.gogostudy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fant.J.
 * 2018/9/19 22:25
 */
public class 杨辉三角II {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getRow(5);
    }
    static class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> list = new ArrayList<>();
            if (rowIndex < 0) {
                return list;
            }
            list.add(1);
            if (rowIndex == 0) {
                return list;
            }
            for (int i = 1; i <= rowIndex ; i++) {
                for (int j = list.size()-1; j > 0; j--) {
                    list.set(j,list.get(j-1)+list.get(j));
                }
                list.add(1);
            }
            return list;
        }
    }
}
