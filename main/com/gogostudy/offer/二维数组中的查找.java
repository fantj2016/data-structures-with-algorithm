package com.gogostudy.offer;

public class 二维数组中的查找 {
    class Solution {
        public boolean Find(int target, int [][] array) {
            for (int i = 0; i< array.length; i++){
                int low = 0;
                int height = array[i].length-1;
                // 如果 最小值 小于 列最大高度
                while (low<=height){
                    // 获取 中间值(二分)
                    int mid = (low+height)/2;
                    // 如果目标值 比 中间值大， 则把low赋值为 当前mid+1
                    if (target > array[i][mid]){
                        low = mid+1;
                        //如果目标值 比 中间值小， 则把最大值 赋值为 当前height-1
                    }else if (target < array[i][mid]){
                        height = height-1;
                    }else if (target == array[i][mid]){
                        return true;
                    }
                }
            }
        return false;
        }
    }
}
