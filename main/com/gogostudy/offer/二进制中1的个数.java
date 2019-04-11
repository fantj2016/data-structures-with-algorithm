package com.gogostudy.offer;

public class 二进制中1的个数 {
    public int NumberOf1(int n) {
        // 为了防止负数右移 前面补1 造成死循环 ，这里用 1 左移 来和 n取与比较
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if ((n & flag) != 0){
                count++;
                flag = flag<<1;
            }
        }
        return count;
    }
}
