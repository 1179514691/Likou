package com.yang.design;

public class TripleInOne {

    //����һ������ջ
    private int[] stack;
    //����һ��ͷָ�������
    private int[] top;

    public TripleInOne(int stackSize) {
        //������ջ��һ
       stack = new int[stackSize * 3];
       // ����ջ��ͷ���
       top = new int[3];

       //�ֱ�ֵ��һ�ε�ͷ���
        // ջ0 top[0] = 0;
        // ջ1 top[1] = 1;
        // ջ2 top[2] = 2;
       for (int i = 0; i < 3; i++) {
           top[i] = i;
       }
    }

    public void push(int stackNum, int value) {
        //�ж��Ƿ��������
        if (top[stackNum] < stack.length) {
            //��ֵ
            stack[top[stackNum]] = value;
            //ͷ���+3
            top[stackNum] = top[stackNum] + 3;
        }
    }

    public int pop(int stackNum) {

        //�ж��Ƿ�Ϊ��
        if (isEmpty(stackNum)) {
            return -1;
        }
        //ԭ����top[stackNum]��3
        top[stackNum] = top[stackNum] - 3;

        //����
        return stack[(top[stackNum])];


    }

    public int peek(int stackNum) {
        //�ж��Ƿ�Ϊ��
        if (isEmpty(stackNum)) {
            return -1;
        }
        //���±�������ǲ��ı�ԭ����top[stackNum]
        int index = top[stackNum] - 3;
        return stack[index];
    }

    public boolean isEmpty(int stackNum) {
        //�ж����ջ�Ƿ�Ϊ��
        if (top[stackNum] -3 < 0) {
            return true;
        }
        return false;
    }
}
