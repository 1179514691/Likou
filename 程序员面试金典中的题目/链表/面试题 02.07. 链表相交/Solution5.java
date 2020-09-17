package com.yang.linkedList;

public class Solution5 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode tempA = headA;

        while (tempA != null) {
            ListNode tempB = headB;
            while(tempB != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }

        return null;
    }


    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != tempB) {

            if (tempA != null) {
                tempA = tempA.next;
            }else {
                tempA = headB;
            }

            if (tempB != null) {
                tempB = tempB.next;
            }else {
                tempB = headA;
            }
        }

        return tempA;

    }
}
