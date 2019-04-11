package com.gogostudy.leetcode.array;

/**
 * Created by Fant.J.
 * 2018/8/22 8:54
 */
public class 最大子序和 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int i = solution.maxSubArray(new int[]{-1,-2});
//        System.out.println(i);
        int i1 = solution.maxSubArray3(new int[]{1,2});
        System.out.println(i1);
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            if (nums == null) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int max = -1000;
            for (int i = 0; i < nums.length; i++) {
                //每一次遍历完需要初始化一次
                int temp = 0;
                for (int j = i; j < nums.length; j++) {
                    temp += nums[j];
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
            return max;
        }

        public int maxSubArray2(int[] nums) {
            int temp = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                temp += nums[i];
                if (temp > max) {
                    max = temp;
                } else if (temp < 0) {
                    temp = 0;
                }
            }
            return max;
        }

        public int maxSubArray3(int[] nums) {
            //将nums数组分割
            return subSum(nums,0,nums.length-1);
        }
        public static int subSum(int a[],int left,int right){
            //如果nums长度为1
            if (left == right){
                if (a[left]>0) {
                    return a[left];
                }else {
                    return a[left];
                }
            }
            //如果nums长度不为1
            int center = (left+right)/2;
            int maxLeftSum = subSum(a,left,center);
            int maxRightSum = subSum(a,center+1,right);

            int leftSum = 0;
            int maxTempLeftSum = -1000;
            for (int i = center;i>=left;i--){
                leftSum += a[i];
                if (leftSum>maxTempLeftSum){
                    maxTempLeftSum = leftSum;
                }
            }
            int rightSum = 0;
            int maxTempRightSum = -1000;
            for (int i = center+1;i<=right;i++){
                rightSum += a[i];
                if (rightSum>maxTempRightSum){
                    maxTempRightSum = rightSum;
                }
            }
            int temp = maxLeftSum>maxRightSum?maxLeftSum:maxRightSum;
            int result = temp>(maxTempLeftSum+maxTempRightSum)?temp:maxTempLeftSum+maxTempRightSum;
            return result;
        }
    }
}
