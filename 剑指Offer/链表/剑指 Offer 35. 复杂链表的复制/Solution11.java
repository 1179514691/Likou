package com.yang.linkedList;


import java.util.HashMap;

public class Solution11 {
    public Node copyRandomList(Node head) {

        //判断是否为空
        if (head == null) {
            //空直接返回null
            return null;
        }

        //头节点给到临时节点
        Node temp = head;
        //创建一个hashMap
        HashMap<Node,Node> map = new HashMap<>();

        //遍历
        while(temp != null) {
            //以temp作为key,创建val相等的Node
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }

        //重新把头节点给到临时节点
        temp = head;

        //遍历
        while(temp != null) {

            //节点指向下一个节点
            map.get(temp).next = map.get(temp.next);

            //给刚刚创建的Node节点的random 赋值节点
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        //返回
        return map.get(head);

    }

    public Node copyRandomList2(Node head) {

        if (head == null) {
            return null;
        }

        Node temp = head;

        //复制链表节点
        while(temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = temp.next.next;
        }

        //复制链表节点的随机指针
        temp = head;
        while(temp != null) {

            //判断原来的节点是否没有random
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }

        //把链表一分为二
        Node copyHead = head.next;
        temp = head;
        Node tempCopy = head.next;

        while(temp != null) {

            temp.next = temp.next.next;
            temp = temp.next;

            if (tempCopy.next != null) {
                tempCopy.next = tempCopy.next.next;
                tempCopy = tempCopy.next;
            }
        }

        return copyHead;

    }
}
