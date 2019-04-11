package com.gogostudy.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * Created by Fant.J.
 * 2018/8/10 18:28
 */
public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new RuntimeException();
    }
    public int[] twoSum_map(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++) {
            int dv = target - nums[i];
            if (map.containsKey(dv)){
                return new int[]{map.get(dv),i};
            }
            map.put(nums[i],i);
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int target = 6;
        两数之和 t = new 两数之和();
        t.twoSum(nums,target);
    }
}
