package com.gogostudy.leetcode.array;

/**
 * Created by Fant.J.
 * 2018/8/21 9:24
 */
public class 删除排序数组中的重复项 {
    public static void main(String[] args) {

    }

    /**
     * [1,1,2],    1, 2
     * 2
     */
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums == null){
                return 0;
            }
            int index = 0;
            for (int i = 0;i<nums.length ;i++){
                //
                /**
                 * index=0 nums[index]表示拿出第一个当临时值
                 * 如果当前元素(num[i])和 前面的元素相等，则跳过,如果不相等，把index+1并把当前元素赋值
                 */
                if (nums[i] == nums[index]){
                    //do nothing
                }else {
                    index++;
                    nums[index] = nums[i];
                }
            }
            return ++index;
        }
    }
}
