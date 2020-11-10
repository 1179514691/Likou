package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    private Deque<Integer> stack;  //栈1
    private Deque<Integer> stack2; //栈2
    public MyQueue() {
        stack = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        stackSwap(stack,stack2);
        int value = stack2.pop();
        stackSwap(stack2,stack);
        return value;
    }

    public int peek() {
        stackSwap(stack,stack2);
        int value = stack2.peek();
        stackSwap(stack2,stack);
        return value;
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    /**
     *
     * @param s 要pop的栈
     * @param s2 接收pop的栈
     */
    private void stackSwap(Deque<Integer> s, Deque<Integer> s2) {
        while(!s.isEmpty()) {
            s2.push(s.pop());
        }
    }
}
