package com.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * Created by Fant.J.
 * 2018/10/3 9:53
 */
public class 只出现一次的数字II {
    class Solution {
        public int singleNumber(int[] nums) {
            Arrays.sort(nums);
            if (nums.length <= 1){
                return nums[0];
            }
            if (nums[0] != nums[1]){
                return nums[0];
            }
            if (nums[nums.length-1] != nums[nums.length-2]){
                return nums[nums.length-1];
            }
            for (int i = 3; i<nums.length-3;i+=3){
                if (nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            return 0;
        }
    }
}
