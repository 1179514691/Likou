package com.yang.linkedList;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode removeDuplicateNodes(ListNode head) {

        if (head == null) {
            return null;
        }

        HashSet<Integer> set = new HashSet<>();

        set.add(head.val);

        ListNode temp = head;

        while(temp.next != null) {
            if (set.add(temp.next.val)) {
                temp = temp.next;
            }else {
                temp.next = temp.next.next;
            }

        }


        return head;
    }

    public ListNode removeDuplicateNodes2(ListNode head) {

        if (head == null) {
            return null;
        }

       ListNode temp = head;

        HashSet<Integer> set =new HashSet<>();

        set.add(head.val);


        while (temp.next != null) {
            if (set.contains(temp.next.val)) {
                temp.next = temp.next.next;

            }else {
                set.add(temp.next.val);
                temp = temp.next;
            }
        }

        return head;
    }
}
