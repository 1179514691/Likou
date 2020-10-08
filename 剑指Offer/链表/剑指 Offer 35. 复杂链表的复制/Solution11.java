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
}
