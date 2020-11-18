package com.liko.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution6 {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {

            if (index < target.length) {
                stack.push(i);
                list.add("Push");
            }

            if (index < target.length &&stack.peek() != target[index]) {
                stack.pop();
                list.add("Pop");
            }else {
                index++;
            }

        }

        return list;
    }

    public List<String> buildArray2(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {

            if (index <= target.length -1) {
                list.add("Push");
            }

            if (index <= target.length -1 && i != target[index]) {
                list.add("Pop");
            }else {
                index++;
            }
        }

        return list;
    }
}
