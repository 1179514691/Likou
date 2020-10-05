package com.yang.linkedList;

public class Solution6 {
    public ListNode getKthFromEnd(ListNode head, int k) {

        //临时节点
        ListNode temp = head;

        //次数
        int count = 1;

        //计算链表总的次数
        while(temp.next != null) {
            //每次加1
            count++;
            //给到下一个节点
            temp = temp.next;
        }

        //头节点重新给到临时节点
        temp = head;
        //计算倒数的节点
        count = count - k;

        //循环count次
        while(count > 0 && temp.next != null) {
            temp = temp.next;
            count--;
        }

        //返回节点
        return temp;
    }
    public ListNode getKthFromEn2(ListNode head, int k) {

        ListNode afterNode = head; //后节点
        ListNode beforeNode = head; //前节点

        for (int i = 1; i < k; i++) {
            //先让后节点先走,走k次
            afterNode = afterNode.next;
        }

        //前后指针依次走,直到后指针停下来
        while(afterNode.next != null) {
            afterNode = afterNode.next;
            beforeNode = beforeNode.next;
        }

        //返回前节点
        return beforeNode;
    }
}
