package com.yang.design;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelf {

    private Queue<int[]> catQueue; //猫
    private Queue<int[]> dogQueue; //狗

    public AnimalShelf() {
        catQueue = new LinkedList<>();
        dogQueue = new LinkedList<>();
    }

    //入队
    public void enqueue(int[] animal) {
        if (animal[1] == 0) { //猫
            catQueue.offer(animal);
        }else {
            dogQueue.offer(animal); //狗
        }
    }

    public int[] dequeueAny() {

        //判断两个栈是否都为空
        if (catQueue.isEmpty()&&dogQueue.isEmpty()) {
            return new int[]{-1,-1};
        }

        //判断两个栈中,其中一个是否为空
        if (catQueue.isEmpty() || dogQueue.isEmpty()) {
            //判断猫栈是否为空, 如果 true 就抛出狗的, 否则就抛出猫的
            return catQueue.isEmpty()  ? dogQueue.poll() : catQueue.poll();
        }

        //窥视
        int[] cat = catQueue.peek();
        int[] dog = dogQueue.peek();

        //比较编号哪个小,越小就是越早进来的
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

