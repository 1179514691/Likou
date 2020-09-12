package com.yang.stack;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    /** Initialize your data structure here. */
    //�ڴ˳�ʼ���������ݽṹ��
    public MyQueue() {

        //��һ��ջ�����洢
        stack1 = new Stack<>();
        //�ڶ���ջ��������
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    //��Ԫ��x�Ƶ����еĺ��档
    public void push(int x) {
        //ʹ�õ�һ��ջ���д洢
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    //�Ӷ���ǰ��ɾ����Ԫ�ز����ظ�Ԫ�ء�
    public int pop() {
        //�ж�ջ1�Ƿ�Ϊ�� ���������Ϊ���� false, ������! ȡ��
        while (!stack1.empty()) {
            //��ջ1��ֵ,ȫ���ŵ�ջ2
            //����ջ���Ƚ����, ���Ի��ѭ����еߵ�
            //����: �洢 1 2 3
            //��ô�����Ƚ���� �Ͱ� 3 2 1 �洢�� ջ2��
            stack2.push(stack1.pop());
        }
        //�����׳�ջ2��ֵ, �����Ƚ������ԭ�� 3 2 1 ��ʱ�׳� 1
        int result = stack2.pop();

        //�ж�ջ2�Ƿ�Ϊ�� ���������Ϊ���� false, ������! ȡ��
        while (!stack2.empty()) {
            //��ʱ�Ѹոյߵ���˳��ԭ����
            stack1.push(stack2.pop());
        }

        return result;
    }

    /** Get the front element. */
    //��ȡǰԪ�ء�
    public int peek() {
        //�ж�ջ1�Ƿ�Ϊ�� ���������Ϊ���� false, ������! ȡ��
        while (!stack1.empty()) {
            //����ջ���Ƚ����, ���Ի��ѭ����еߵ�
            stack2.push(stack1.pop());
        }

        //͵��ֵ
        int result = stack2.peek();

        while (!stack2.empty()) {
            //��ʱ�Ѹոյߵ���˳��ԭ
            stack1.push(stack2.pop());
        }

        return result;
    }

    /** Returns whether the queue is empty. */
    //���ض����Ƿ�Ϊ�ա�
    public boolean empty() {
        return stack1.empty();
    }
}
