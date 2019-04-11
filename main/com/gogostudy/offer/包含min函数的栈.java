package com.gogostudy.offer;

import java.util.Stack;

public class 包含min函数的栈 {
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || node< minStack.peek()){
            minStack.push(node);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return  dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
