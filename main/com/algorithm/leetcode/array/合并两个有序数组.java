package com.algorithm.leetcode.array;

/**
 * Created by Fant.J.
 * 2018/8/26 21:53
 */
public class 合并两个有序数组 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        solution.merge(new int[]{0},0,new int[]{1},1);
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m-1;
            int j = n-1;
            int index = m+n-1;
            /**
             * 如果i和j都大于0，证明两个数组都有值，需要比较
             */
            while (i>=0 && j>=0){
                if (nums1[i]>nums2[j]){
                    nums1[index--] = nums1[i--];
                }else {
                    nums1[index--] = nums2[j--];
                }
            }
            while (i>=0){
                nums1[index--] = nums1[i--];
            }
            while (j>=0){
                nums1[index--] = nums2[j--];
            }
//            int test = nums1.length-1;
//            while (test>=0){
//                System.out.println(nums1[test--]);
//            }
        }
    }
    static class Solution2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m-1;
            int j = n-1;
            int index = m+n-1;
            /**
             * 如果i和j都大于0，证明两个数组都有值，需要比较
             */
            while (i>=0 && j>=0){
                nums1[index--] = (nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
            }
            while (i>=0){
                nums1[index--] = nums1[i--];
            }
            while (j>=0){
                nums1[index--] = nums2[j--];
            }
//            int test = nums1.length-1;
//            while (test>=0){
//                System.out.println(nums1[test--]);
//            }
        }
    }
}
