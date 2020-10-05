package com.yang.linkedList;

public class Solution7 {
    //把每个节点都插到节点的前面(头插法)
    public ListNode reverseList(ListNode head) {

        //当前节点
        ListNode nowNode = head;

        //当前节点的下一个节点
        ListNode nextNode;

        //反转节点
        ListNode reverseNode = null;


        //判断当前节点是否为空
        while(nowNode != null) {
            //把下个节点先给到nextNode
            nextNode = nowNode.next;
            //把当前的反转节点的第一个节点给到临时节点
            ListNode temp = reverseNode;
            //把当前的节点给到反转节点
            reverseNode = nowNode;
            //反转节点的下一个节点连接temp
            reverseNode.next =temp;
            //把刚刚保存的下一个节点给到当前节点
            nowNode = nextNode;
        }


        //返回节点
        return reverseNode;
    }
}
