package com.yang.linkedList;

public class Solution8 {
    public ListNode deleteNode(ListNode head, int val) {

        //判断当前的值是否是删除的节点
        if (head.val == val) {
            //如果是的话,直接放回下个节点开始
            return head.next;
        }

        //当前节点
        ListNode temp = head;

        //循环 判断节点的下一个节点是否为空 并且 判断节点的下一个节点的值是否等于val
        //如果不为空且断节点的下一个节点的值不等于val
        while(temp.next != null && temp.next.val != val) {
            //向下走一个节点
            temp = temp.next;
        }

        //判断当前节点下一个节点是否为空
        //并且此时我们的下一个节点的val一定是我们要找的值
        if (temp.next != null) {
            //直接让当前节点指向下一个节点的下一个节点
            //即删除当前节点的下一个节点
            temp.next = temp.next.next;
        }

        //返回头结点
        return head;

    }
}
