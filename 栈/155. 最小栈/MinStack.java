package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class MinStack {

    Deque<Integer> stack;   //栈
    Deque<Integer> stackMin;   //用来存放最小栈


    public MinStack() {
        stack = new ArrayDeque<>();
        stackMin = new ArrayDeque<>();
        stackMin.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if (stackMin.isEmpty() || x < stackMin.peek()) {
            stackMin.push(x);
        }else {
            stackMin.push(stackMin.peek());
        }
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.isEmpty() ? -1 :stack.peek();
    }

    public int getMin() {
        return stackMin.isEmpty() ? -1 : stackMin.peek();

    }
}
