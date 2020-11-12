package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    public int calPoints(String[] ops) {

        //��ʱ��ŵĽ����
        int[] tempRes = new int[ops.length];
        int index = 0; //��ʱ��Ž�������±�
        int res = 0; // ����������

        for (int i = 0; i < ops.length; i++) {
            switch(ops[i]) {
                case "C" :
                    //�Ƴ���һλ
                    index--;
                    res -= tempRes[index];
                    break;
                case "D":
                    //��ʾ��һ�ε�����
                    tempRes[index] = tempRes[index -1] * 2;
                    res += tempRes[index];
                    index++;
                    break;
                case "+" :
                    tempRes[index] = tempRes[index-2] + tempRes[index-1];
                    res += tempRes[index];
                    index++;
                    break;
                    //Ĭ��������
                default:
                    tempRes[index] = Integer.parseInt(ops[i]);
                    res += tempRes[index];
                    index++;
            }
        }
        return res;
    }

    public int calPoints2(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for (int i = 0; i < ops.length; i++) {
            switch(ops[i]) {
                case "C" :
                    //�Ƴ���һλ
                    res -= stack.pop();
                    break;
                case "D":
                    //��ʾ��һ�ε�����
                    res += stack.peek()*2;
                    stack.push(stack.peek()*2);
                    break;
                case "+" :
                    int beforeValue = stack.pop();
                    int newValue = beforeValue + stack.peek();
                    res += newValue;
                    stack.push(beforeValue);
                    stack.push(newValue);
                    break;
                //Ĭ��������
                default:
                    res += Integer.parseInt(ops[i]);
                    stack.push(Integer.parseInt(ops[i]));
            }
        }

        return res;

    }
}
