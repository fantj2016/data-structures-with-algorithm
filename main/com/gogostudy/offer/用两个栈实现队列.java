package com.gogostudy.offer;

import java.util.Stack;

public class 用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * 借助A来调整顺序
     */
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        // 如果B为空， 就把 A.pop 放入 B
        if (stack2.empty()){
            while (!stack2.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
