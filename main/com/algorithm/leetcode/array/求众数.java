package com.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 */
public class 求众数 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.majorityElement(new int[]{3, 2, 3});
        System.out.println(i);
    }
    static class Solution {
        public int majorityElement(int[] nums) {
            if (nums.length == 1){
                return nums[0];
            }
            Arrays.sort(nums);
            int count = 1;
            int corrent = nums[0];
            for (int i = 1; i< nums.length; i++){
                //如果当前值 和下一个值相等，count ++ ，
                // 否则，判断count是否 > nums.length/2，如果是则return，
                    // 否则，将 corrent 重新赋值，result 归零
                if (corrent == nums[i]){
                    count++;
                    if (count >
                            nums.length/2){
                        return nums[i];
                    }else {
                        //do nothing
                    }
                }else {
                    corrent = nums[i];
                    count = 1;
                }
            }
            return 0;
        }
    }
}
