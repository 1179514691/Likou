package com.yang.stack;

public class MaxQueue {

   private int[] queue; //模拟栈
   private int start = 0; //开始
   private int end = 0; //结束

    public MaxQueue() {
        queue = new int[10000];
    }

    public int max_value() {
        if (end - start == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
           max = Math.max(max,queue[i]);
        }
        return max;
    }

    public void push_back(int value) {
       queue[end++] = value;
    }

    public int pop_front() {
        if (end - start == 0) {
            return -1;
        }
       return queue[start++];
    }


}
