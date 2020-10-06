package com.yang.linkedList;

public class Solution8 {
    public ListNode deleteNode(ListNode head, int val) {

        //�жϵ�ǰ��ֵ�Ƿ���ɾ���Ľڵ�
        if (head.val == val) {
            //����ǵĻ�,ֱ�ӷŻ��¸��ڵ㿪ʼ
            return head.next;
        }

        //��ǰ�ڵ�
        ListNode temp = head;

        //ѭ�� �жϽڵ����һ���ڵ��Ƿ�Ϊ�� ���� �жϽڵ����һ���ڵ��ֵ�Ƿ����val
        //�����Ϊ���ҶϽڵ����һ���ڵ��ֵ������val
        while(temp.next != null && temp.next.val != val) {
            //������һ���ڵ�
            temp = temp.next;
        }

        //�жϵ�ǰ�ڵ���һ���ڵ��Ƿ�Ϊ��
        //���Ҵ�ʱ���ǵ���һ���ڵ��valһ��������Ҫ�ҵ�ֵ
        if (temp.next != null) {
            //ֱ���õ�ǰ�ڵ�ָ����һ���ڵ����һ���ڵ�
            //��ɾ����ǰ�ڵ����һ���ڵ�
            temp.next = temp.next.next;
        }

        //����ͷ���
        return head;

    }
}
