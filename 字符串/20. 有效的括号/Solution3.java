package com.liko.string;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
                continue;
            }
            if ( (chars[i] == ')' || chars[i] == '}' || chars[i] == ']' ) && (stack.size() == 0)) {
                return false;
            }
            if (chars[i] == ')') {
                if (! (stack.pop() == '(')) {
                    return false;
                }
            }else if (chars[i] == '}') {
                if (! (stack.pop() == '{')) {
                    return false;
                }
            }else {
                if (! (stack.pop() == '[')) {
                    return false;
                }
            }

        }

        return stack.size() == 0;
    }
    public boolean isValid2(String s) {

        Deque<Character> stack = new ArrayDeque<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(' :
                case '{' :
                case '[' :
                    stack.push(chars[i]);
                    break;
                case ')' :
                    if (stack.size() == 0 || !(stack.pop() == '(')) {
                        return false;
                    }
                    break;
                case '}' :
                    if (stack.size() == 0 || !(stack.pop() == '{')) {
                        return false;
                    }
                    break;
                case ']' :
                    if (stack.size() == 0 || !(stack.pop() == '[')) {
                        return false;
                    }
                    break;
            }
        }

        return stack.size() == 0;
    }
}
