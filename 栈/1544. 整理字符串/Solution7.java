package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution7 {
    public String makeGood(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || (stack.peek() != c - 32 && stack.peek() != c+32) ){
                stack.push(c);
            }else { //这里相当于 stack.peek() == chars[i] - 32 || stack.peek() == chars[i]+32
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public String makeGood2(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0, top = -1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (top < 0 || (sb.charAt(top) != c -32 && sb.charAt(top) != c +32)) {
                sb.append(c);
                top++;
            }else {
                sb.deleteCharAt(top);
                top--;
            }
        }

        return sb.toString();
    }
}
