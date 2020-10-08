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
}
