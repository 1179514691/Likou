package com.yang.stack;

public class MinStack {

    private Node head;
    private Node end;

    public MinStack() {
        head = new Node();
        end = head;
    }

    public void push(int x) {

        Node node = new Node();
        node.value = x;
        //指向该结点
        end.next = node;
        //指向上一个结点
        node.prior = end;
        end = node;

    }

    public void pop() {
        //最后个结点给到temp
        Node temp = end;
        //把end的上一个结点给到end
        end = temp.prior;
        //end的上一个结点指向null
        temp.prior.next = null;

    }

    public int top() {
        return end.value;
    }

    public int getMin() {
        Node temp = head.next;
        int min = temp.value;

        while (temp.next != null) {
            if (min > temp.next.value) {
                min = temp.next.value;
            }
            temp = temp.next;
        }

        return min;
    }

    class Node {
        public Node prior; //前指针
        public int value;
        public Node next;   //后指针
    }
}
