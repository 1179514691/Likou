package com.yang.linkedList;


import java.util.HashMap;

public class Solution11 {
    public Node copyRandomList(Node head) {

        //�ж��Ƿ�Ϊ��
        if (head == null) {
            //��ֱ�ӷ���null
            return null;
        }

        //ͷ�ڵ������ʱ�ڵ�
        Node temp = head;
        //����һ��hashMap
        HashMap<Node,Node> map = new HashMap<>();

        //����
        while(temp != null) {
            //��temp��Ϊkey,����val��ȵ�Node
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }

        //���°�ͷ�ڵ������ʱ�ڵ�
        temp = head;

        //����
        while(temp != null) {

            //�ڵ�ָ����һ���ڵ�
            map.get(temp).next = map.get(temp.next);

            //���ոմ�����Node�ڵ��random ��ֵ�ڵ�
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        //����
        return map.get(head);

    }

    public Node copyRandomList2(Node head) {

        if (head == null) {
            return null;
        }

        Node temp = head;

        //��������ڵ�
        while(temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = temp.next.next;
        }

        //��������ڵ�����ָ��
        temp = head;
        while(temp != null) {

            //�ж�ԭ���Ľڵ��Ƿ�û��random
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }

        //������һ��Ϊ��
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
