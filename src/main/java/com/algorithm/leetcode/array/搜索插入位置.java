package com.algorithm.leetcode.array;

/**
 * Created by Fant.J.
 * 2018/8/21 11:07
 */
public class 搜索插入位置 {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            if (nums == null) {
                return 0;
            }
            /**
             * 思路：逐个比较，没有相等的数的话就插入。
             */
            for (int i = 0; i < nums.length; i++) {
                //如果目标值比当前值大，啥也不做，如果比当前值小，插入，如果等于当前值，返回。
                if (target <= nums[i]) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}
