package com.liko.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {


    private Queue<Integer> queue ;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {

        int res = t -3000;

        if (res< 0) {
            queue.add(t);
        }else {

            while (!queue.isEmpty() && queue.peek() < res) {
                queue.remove();
            }
            queue.add(t);
        }

        return queue.size();
    }
}

