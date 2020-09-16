package com.yang.linkedList;

import java.util.Stack;

public class Solution4 {

    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        //��ȡ�ڵ����ջ
        Stack<Integer> stack = setStack(head);

        //�Ƚ�
        while(head.next != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }

        return true;
    }

    //���뵽ջ��
    private Stack<Integer> setStack(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        return stack;
    }

    public boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode midNode = findMidNode(head);
        ListNode reverseList = reverseLinked(midNode);

        ListNode curr = head;
        ListNode curr2 = reverseList;
        while(curr2.next != null) {
            if (curr.val != curr2.val) {
                return false;
            }
            curr = curr.next;
            curr2 = curr2.next;
        }
        return true;
    }

    //Ѱ���м�ָ��
    private ListNode findMidNode(ListNode head) {
        //��ָ��
        ListNode fast = head;
        //��ָ��
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //��תָ��
    private ListNode reverseLinked(ListNode head) {
        //��ʱ���
        ListNode temp = head;
        //��ת�Ľ��
        ListNode prev = null;

        while(temp != null) {
            //��һ�����
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }


}
