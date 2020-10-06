package com.yang.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution9 {
    public int[] reversePrint(ListNode head) {

        //����һ����ʱ�ڵ�
        ListNode temp = head;
        //����һ��ArrayList����
        List<Integer> list = new ArrayList<Integer>();

        //����
        while(temp != null) {
            //�洢
            list.add(temp.val);
            //��һ���ڵ�
            temp = temp.next;
        }

        //����
        int len = list.size();
        //��������
        int[] res = new int[len];
        //�±�
        int index = 0;

        //���Ŵ洢
        for (int i = len -1; i >= 0; i--) {
            res[index++] = list.get(i);
        }


        return res;
    }

    public int[] reversePrint2(ListNode head) {

        //����һ����ʱ�ڵ�
        ListNode temp = head;

        //ͳ��
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;

        //��������
        int[] res = new int[count];

        //���Ŵ洢
        while(temp != null) {
            res[--count] = temp.val;
            temp = temp.next;
        }

        return res;
    }
}
