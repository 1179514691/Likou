package com.yang.stack;

import java.util.LinkedList;

public class MinStack {

    private LinkedList<Integer> stack;
    private int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new LinkedList<>();
    }

    public void push(int x) {

        if(min >= x){
            stack.push(min);
            min = x;
        }

        stack.push(x);
    }

    public void pop() {

        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }

}



