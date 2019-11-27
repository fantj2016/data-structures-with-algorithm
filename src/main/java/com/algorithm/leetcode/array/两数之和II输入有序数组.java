package com.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class 两数之和II输入有序数组 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0;i<numbers.length;i++) {
                int dv = target - numbers[i];
                if (map.containsKey(dv)){
                    return new int[]{map.get(dv)+1,i+1};
                }
                map.put(numbers[i],i);
            }
            throw new RuntimeException(); 
        }
    }
}
