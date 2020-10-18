package com.yang.other;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        if(pushed.length != popped.length) {
            return false;
        }

        //����һ��ջ
        Deque<Integer> stack = new ArrayDeque<Integer>();


        int i = 0;

        //ѭ����ջ
        for (int elem : pushed) {
            //��ջ
            stack.push(elem);
            //�ж�ջ�Ƿ�Ϊ��, ͵��ջ����Ԫ���ж��Ƿ������Ҫ�Ƚϵ�ջ�е�Ԫ��
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                //�׳�
                stack.pop();
                //�Ƚ���һ���ڵ�
                i++;
            }
        }

        //�ж��Ƿ����
        return i == popped.length;

    }
}
