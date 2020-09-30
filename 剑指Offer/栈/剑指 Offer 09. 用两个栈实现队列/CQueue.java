package com.yang.stack;

import java.util.LinkedList;
import java.util.Stack;

public class CQueue {

    private LinkedList<Integer> stackOne;
    private LinkedList<Integer>  stackTwo;


    public CQueue() {
        stackOne = new LinkedList<>();
        stackTwo = new LinkedList<>();
    }

    public void appendTail(int value) {
        //»Î’ª
        stackOne.push(value);
    }

    public int deleteHead()
    {

        if (!stackTwo.isEmpty()){
            return stackTwo.removeLast();
        }

        if (stackOne.isEmpty()) {
            return -1;
        }

        while(!stackOne.isEmpty()) {
            stackTwo.addLast(stackOne.pop());
        }

        return stackTwo.removeLast();

    }

}
