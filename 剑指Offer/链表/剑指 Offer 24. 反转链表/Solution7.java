package com.yang.linkedList;

public class Solution7 {
    //��ÿ���ڵ㶼�嵽�ڵ��ǰ��(ͷ�巨)
    public ListNode reverseList(ListNode head) {

        //��ǰ�ڵ�
        ListNode nowNode = head;

        //��ǰ�ڵ����һ���ڵ�
        ListNode nextNode;

        //��ת�ڵ�
        ListNode reverseNode = null;


        //�жϵ�ǰ�ڵ��Ƿ�Ϊ��
        while(nowNode != null) {
            //���¸��ڵ��ȸ���nextNode
            nextNode = nowNode.next;
            //�ѵ�ǰ�ķ�ת�ڵ�ĵ�һ���ڵ������ʱ�ڵ�
            ListNode temp = reverseNode;
            //�ѵ�ǰ�Ľڵ������ת�ڵ�
            reverseNode = nowNode;
            //��ת�ڵ����һ���ڵ�����temp
            reverseNode.next =temp;
            //�Ѹոձ������һ���ڵ������ǰ�ڵ�
            nowNode = nextNode;
        }


        //���ؽڵ�
        return reverseNode;
    }
}
