package com.yang.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution9 {
    public int[] reversePrint(ListNode head) {

        //创建一个临时节点
        ListNode temp = head;
        //创建一个ArrayList集合
        List<Integer> list = new ArrayList<Integer>();

        //遍历
        while(temp != null) {
            //存储
            list.add(temp.val);
            //下一个节点
            temp = temp.next;
        }

        //长度
        int len = list.size();
        //创建数组
        int[] res = new int[len];
        //下标
        int index = 0;

        //倒着存储
        for (int i = len -1; i >= 0; i--) {
            res[index++] = list.get(i);
        }


        return res;
    }

    public int[] reversePrint2(ListNode head) {

        //创建一个临时节点
        ListNode temp = head;

        //统计
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;

        //创建数组
        int[] res = new int[count];

        //倒着存储
        while(temp != null) {
            res[--count] = temp.val;
            temp = temp.next;
        }

        return res;
    }
}
