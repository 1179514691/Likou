package com.yang.linkedList;

import java.util.Stack;

public class Solution2 {
    public int kthToLast(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;

        stack.push(head.val);
        while(temp.next != null) {
            stack.push(temp.next.val);
            temp = temp.next;
        }
        while (k-1 > 0) {
            stack.pop();
            k--;
        }
        return stack.pop();

    }

    public int kthToLast2(ListNode head, int k) {


        ListNode temp = head;

        int nums = 0;
        while(temp != null) {
            nums++;
            temp = temp.next;
        }


        int count = nums - k;
        while(count > 0) {
            head = head.next;
            count--;

        }
        return head.val;
    }

    public int kthToLast3(ListNode head, int k) {


        //快指针
        ListNode first = head;

        for (int i = 0; i < k; i++) {
            first = first.next;
        }


        //当前指针
        ListNode now = head;

        while(first.next != null) {
            first = first.next;
            now = now.next;
        }

        return now.val;
    }
}
