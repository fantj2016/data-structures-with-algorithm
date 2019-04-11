package com.algorithm.leetcode.array;

/**
 * Created by Fant.J.
 * 2018/8/21 9:55
 */
public class 移除元素 {
    public static void main(String[] args) {

    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            /**
             * 思路：拿出第index（初始值0）个数和后面比较，
             * 如果nums当前值等于 val ，不做任何操作
             * 如果nums当前值不等于 val，index++;  然后将值赋值给 nums[index]
             */
            int index = 0;
            for (int i = 0;i<nums.length;i++){
                if (nums[i] == val){
                    //do nothing
                }else {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }
}
