package com.liko.stack;

class MinStack2 {

    private ListNode head;

    public void push(int x) {
        if (isEmpty()) {
            head = new ListNode(x,x,null);
        }else {
            head = new ListNode(x,Math.min(x,head.min),head);
        }
    }

    public void pop() {
        head = head.next;

    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private boolean isEmpty() {
        return head == null;
    }

}

class ListNode {
    public int val;
    public int min;//最小值
    public ListNode next;

    public ListNode(int val, int min, ListNode next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}

