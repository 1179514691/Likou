package com.yang.linkedList;

import java.util.Stack;

public class Solution4 {

    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        //获取节点存入栈
        Stack<Integer> stack = setStack(head);

        //比较
        while(head.next != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }

        return true;
    }

    //存入到栈中
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

    //寻找中间指针
    private ListNode findMidNode(ListNode head) {
        //快指针
        ListNode fast = head;
        //慢指针
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //反转指针
    private ListNode reverseLinked(ListNode head) {
        //临时结点
        ListNode temp = head;
        //反转的结点
        ListNode prev = null;

        while(temp != null) {
            //下一个结点
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }


}
