package com.algorithm.leetcode.array;

public class 旋转数组 {
    class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reserve(nums,0,nums.length-1);
            reserve(nums,0,k-1);
            reserve(nums,k,nums.length-1);
        }

        /**
         * 逆转数组元素
         * start: 起始地址索引
         * end: 最后索引
         */
        void reserve(int[] nums, int start, int end){
            while (start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}
