package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution5 {
    public String removeDuplicates(String S) {
        //创建一个栈
        Deque<Character> stack  = new ArrayDeque<>();
        //转换成字符数组
        char[] chars = S.toCharArray();
        //遍历
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty() || stack.peek() != chars[i]) {
                stack.push(chars[i]);
            }else if (stack.peek() == chars[i]) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public String removeDuplicates2(String S) {

        if (S.length() == 0 || S.length() == 1) {
            return S;
        }

        int top = -1; //栈顶
        //转换成字符数组
        char[] chars = S.toCharArray();

        StringBuilder sb = new StringBuilder();
        //遍历
        for (int i = 0; i < chars.length; i++) {
            if (top > -1 && sb.charAt(top) == chars[i]) {
                sb.deleteCharAt(top);
                top--;
            }else {
                top++;
                sb.append(chars[i]);
            }
        }

        return sb.toString();
    }
}
