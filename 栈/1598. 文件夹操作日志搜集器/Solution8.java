package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution8 {
    public int minOperations(String[] logs) {
        //创建一个栈
        Deque<String> stack = new ArrayDeque<>();

        for (String log : logs) {

            //如果是./还是当前文件夹,于是什么都不动
           if (log.equals("./")) {
               continue;
           }

           //如果不是../则移动到子目录.于是入栈
           if (!log.equals("../")) {
               stack.push(log);
           }else {
               //说明是../,判断栈是否为空,不为空,就退栈(返回上级)
               if (!stack.isEmpty()){
                   stack.pop();
               }
           }
        }
        //计数
        int count = 0;

        //循环退栈统计
        while (!stack.isEmpty()) {
            stack.pop();
            count++;
        }

        return count;

    }
    public int minOperations2(String[] logs) {
        //计数
        int count = 0;

        for (int i = 0; i < logs.length; i++) {
            //如果是./还是当前文件夹,于是什么都不动
            if (logs[i].equals("./")) {
                continue;
            }
            //如果不是../则移动到子目录. 深度+1
            if (!logs[i].equals("../")) {
                count++;
            }else {
                //说明是../,判断当前深度是否是在当前文件夹,大于0表示有深度,于是返回上级
                if (count > 0){
                    count--;
                }
            }
        }
        for (String log : logs) {


        }

        return count;
    }
}
