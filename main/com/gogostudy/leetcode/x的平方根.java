package com.gogostudy.leetcode;

/**
 * Created by Fant.J.
 * 2018/8/24 9:27
 */
public class x的平方根 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.mySqrt(9);
        System.out.println(i);
    }
    static class Solution {
        public int mySqrt(int x) {
            if (x<=0){
                return x;
            }
            int low = 0;
            int high = x;
            int mid = 0;
            while (low<=high){
                mid = (low+high+1)/2;
                if (mid==x/mid){
                    return mid;
                }else if (mid > x/mid){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            return mid>x/mid?mid-1:mid;
        }
    }
}
