package com.yang.divideAndConquer;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //判断链表中,是否有一个为空
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        //创建合并节点
        ListNode merge;

        //比较头个节点的大小
        //小就给到合并节点,并且指向下一个节点
        if (l1.val < l2.val) {
            merge = new ListNode(l1.val);
            l1 = l1.next;
        }else {
            merge = new ListNode(l2.val);
            l2 = l2.next;
        }

        //临时节点,用来合并
        ListNode temp = merge;


        while(l1 != null && l2 != null) {

            //判断大小
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }

            //走向下个节点
            temp = temp.next;

        }

        //防止l1或者l2其中一个先为空
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
