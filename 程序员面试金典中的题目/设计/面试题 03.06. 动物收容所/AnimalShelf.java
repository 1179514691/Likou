package com.yang.design;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelf {

    private Queue<int[]> catQueue; //è
    private Queue<int[]> dogQueue; //��

    public AnimalShelf() {
        catQueue = new LinkedList<>();
        dogQueue = new LinkedList<>();
    }

    //���
    public void enqueue(int[] animal) {
        if (animal[1] == 0) { //è
            catQueue.offer(animal);
        }else {
            dogQueue.offer(animal); //��
        }
    }

    public int[] dequeueAny() {

        //�ж�����ջ�Ƿ�Ϊ��
        if (catQueue.isEmpty()&&dogQueue.isEmpty()) {
            return new int[]{-1,-1};
        }

        //�ж�����ջ��,����һ���Ƿ�Ϊ��
        if (catQueue.isEmpty() || dogQueue.isEmpty()) {
            //�ж�èջ�Ƿ�Ϊ��, ��� true ���׳�����, ������׳�è��
            return catQueue.isEmpty()  ? dogQueue.poll() : catQueue.poll();
        }

        //����
        int[] cat = catQueue.peek();
        int[] dog = dogQueue.peek();

        //�Ƚϱ���ĸ�С,ԽС����Խ�������
        return cat[0] < dog[0] ? catQueue.poll() :  dogQueue.poll();
    }

    public int[] dequeueDog() {

        if (dogQueue.isEmpty()) {
            return new int[]{-1,-1};
        }else {
            return dogQueue.poll();
        }
    }

    public int[] dequeueCat() {
        if (catQueue.isEmpty()) {
            return new int[]{-1,-1};
        }else {
            return catQueue.poll();
        }
    }
}

