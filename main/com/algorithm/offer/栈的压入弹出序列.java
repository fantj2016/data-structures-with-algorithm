package com.algorithm.offer;

import java.util.Stack;

public class 栈的压入弹出序列 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null){
            return false;
        }
        // 位置标识
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<pushA.length; i++){
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek()==popA[index]){
                // 出站
                stack.pop();
                index++;
            }
        }
        // 如果stack 不为空， 则返回false
        return stack.isEmpty();
    }
}
