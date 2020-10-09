package com.yang.divideAndConquer;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //�ж�������,�Ƿ���һ��Ϊ��
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        //�����ϲ��ڵ�
        ListNode merge;

        //�Ƚ�ͷ���ڵ�Ĵ�С
        //С�͸����ϲ��ڵ�,����ָ����һ���ڵ�
        if (l1.val < l2.val) {
            merge = new ListNode(l1.val);
            l1 = l1.next;
        }else {
            merge = new ListNode(l2.val);
            l2 = l2.next;
        }

        //��ʱ�ڵ�,�����ϲ�
        ListNode temp = merge;


        while(l1 != null && l2 != null) {

            //�жϴ�С
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }

            //�����¸��ڵ�
            temp = temp.next;

        }

        //��ֹl1����l2����һ����Ϊ��
        while(l1 != null) {
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }

        return merge;
    }
}
