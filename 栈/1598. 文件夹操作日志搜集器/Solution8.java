package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution8 {
    public int minOperations(String[] logs) {
        //����һ��ջ
        Deque<String> stack = new ArrayDeque<>();

        for (String log : logs) {

            //�����./���ǵ�ǰ�ļ���,����ʲô������
           if (log.equals("./")) {
               continue;
           }

           //�������../���ƶ�����Ŀ¼.������ջ
           if (!log.equals("../")) {
               stack.push(log);
           }else {
               //˵����../,�ж�ջ�Ƿ�Ϊ��,��Ϊ��,����ջ(�����ϼ�)
               if (!stack.isEmpty()){
                   stack.pop();
               }
           }
        }
        //����
        int count = 0;

        //ѭ����ջͳ��
        while (!stack.isEmpty()) {
            stack.pop();
            count++;
        }

        return count;

    }
    public int minOperations2(String[] logs) {
        //����
        int count = 0;

        for (int i = 0; i < logs.length; i++) {
            //�����./���ǵ�ǰ�ļ���,����ʲô������
            if (logs[i].equals("./")) {
                continue;
            }
            //�������../���ƶ�����Ŀ¼. ���+1
            if (!logs[i].equals("../")) {
                count++;
            }else {
                //˵����../,�жϵ�ǰ����Ƿ����ڵ�ǰ�ļ���,����0��ʾ�����,���Ƿ����ϼ�
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
