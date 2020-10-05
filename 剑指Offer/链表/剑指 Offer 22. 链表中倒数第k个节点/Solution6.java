package com.yang.linkedList;

public class Solution6 {
    public ListNode getKthFromEnd(ListNode head, int k) {

        //��ʱ�ڵ�
        ListNode temp = head;

        //����
        int count = 1;

        //���������ܵĴ���
        while(temp.next != null) {
            //ÿ�μ�1
            count++;
            //������һ���ڵ�
            temp = temp.next;
        }

        //ͷ�ڵ����¸�����ʱ�ڵ�
        temp = head;
        //���㵹���Ľڵ�
        count = count - k;

        //ѭ��count��
        while(count > 0 && temp.next != null) {
            temp = temp.next;
            count--;
        }

        //���ؽڵ�
        return temp;
    }
    public ListNode getKthFromEn2(ListNode head, int k) {

        ListNode afterNode = head; //��ڵ�
        ListNode beforeNode = head; //ǰ�ڵ�

        for (int i = 1; i < k; i++) {
            //���ú�ڵ�����,��k��
            afterNode = afterNode.next;
        }

        //ǰ��ָ��������,ֱ����ָ��ͣ����
        while(afterNode.next != null) {
            afterNode = afterNode.next;
            beforeNode = beforeNode.next;
        }

        //����ǰ�ڵ�
        return beforeNode;
    }
}
