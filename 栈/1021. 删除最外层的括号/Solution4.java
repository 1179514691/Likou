package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution4 {
    public String removeOuterParentheses(String S) {

        char[] chars = S.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty() && chars[i] == '(') {
                stack.push(chars[i]);
            }else if (!stack.isEmpty() && chars[i] == '(') {
                stack.push(chars[i]);
                sb.append("(");
            }

            if (chars[i] == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    sb.append(")");
                }
            }
        }

        return sb.toString();
    }

    public String removeOuterParentheses2(String S) {
        int l = 0;
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                l++;
                if (l > 1) {
                    sb.append("(");
                }
            }
            if (chars[i] == ')') {
                l--;
                if (l != 0) {
                    sb.append(")");
                }
            }
        }

        return sb.toString();
    }
}
