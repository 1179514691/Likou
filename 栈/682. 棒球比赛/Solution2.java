package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    public int calPoints(String[] ops) {

        //暂时存放的结果集
        int[] tempRes = new int[ops.length];
        int index = 0; //暂时存放结果集的下标
        int res = 0; // 存放真正结果

        for (int i = 0; i < ops.length; i++) {
            switch(ops[i]) {
                case "C" :
                    //移除上一位
                    index--;
                    res -= tempRes[index];
                    break;
                case "D":
                    //表示上一次的两倍
                    tempRes[index] = tempRes[index -1] * 2;
                    res += tempRes[index];
                    index++;
                    break;
                case "+" :
                    tempRes[index] = tempRes[index-2] + tempRes[index-1];
                    res += tempRes[index];
                    index++;
                    break;
                    //默认是数字
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
                    //移除上一位
                    res -= stack.pop();
                    break;
                case "D":
                    //表示上一次的两倍
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
                //默认是数字
                default:
                    res += Integer.parseInt(ops[i]);
                    stack.push(Integer.parseInt(ops[i]));
            }
        }

        return res;

    }
}
