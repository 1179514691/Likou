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
        //ָ��ý��
        end.next = node;
        //ָ����һ�����
        node.prior = end;
        end = node;

    }

    public void pop() {
        //����������temp
        Node temp = end;
        //��end����һ��������end
        end = temp.prior;
        //end����һ�����ָ��null
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
        public Node prior; //ǰָ��
        public int value;
        public Node next;   //��ָ��
    }
}
