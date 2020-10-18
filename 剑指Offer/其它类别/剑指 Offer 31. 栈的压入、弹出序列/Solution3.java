package com.yang.other;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        if(pushed.length != popped.length) {
            return false;
        }

        //创建一个栈
        Deque<Integer> stack = new ArrayDeque<Integer>();


        int i = 0;

        //循环入栈
        for (int elem : pushed) {
            //入栈
            stack.push(elem);
            //判断栈是否为空, 偷窥栈顶的元素判断是否等于需要比较的栈中的元素
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                //抛出
                stack.pop();
                //比较下一个节点
                i++;
            }
        }

        //判断是否相等
        return i == popped.length;

    }
}
