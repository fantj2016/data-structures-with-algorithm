package com.algorithm.offer;

public class 替换空格 {
    class Solution {
        public String replaceSpace(StringBuffer str) {
            return str.toString().replaceAll(" ","%20" );
        }
    }
}
