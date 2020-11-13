package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {

    public boolean backspaceCompare(String S, String T) {


        //S字符串退格
        String backspaceS = backspace(S);
        //T字符串退格
        String backspaceT = backspace(T);

        //判断两个栈是否都为空
        return backspaceS.equals(backspaceT);


    }
    public boolean backspaceCompare2(String S, String T) {
        //S字符串退格
        String backspaceS = backspace2(S);
        //T字符串退格
        String backspaceT = backspace2(T);

        //判断两个栈是否都为空
        return backspaceS.equals(backspaceT);
    }

    public boolean backspaceCompare3(String S, String T) {
        //S的最后节点
        int i = S.length() -1;
        //S遇到#的次数
        int  skipS = 0;
        //T的最后节点
        int j = T.length() -1;
        //T遇到#的次数
        int  skipT = 0;

        while(i >= 0 || j >= 0) {
            while(i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                }else if (skipS > 0) {
                    skipS--;
                    i--;
                }else {
                    break;
                }
            }
            while(j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                }else if (skipT > 0) {
                    skipT--;
                    j--;
                }else {
                    break;
                }
            }

            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            }else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }

        return true;
    }

    private String backspace2(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '#'){
                sb.append(chars[i]);
            }else {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }

    /**
     *
     * @param s 需要退格的字符串
     * @return 返回字符串
     */
    private String backspace(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        //转换成字符数组
        char[] ch = s.toCharArray();

        for (int i = 0; i  < ch.length; i++) {
            //如果不是#就入栈
            if (ch[i] != '#') {
                stack.push(ch[i]);
                //是#就判断一下栈是否为空,不为空就抛出
            }else if (!stack.isEmpty()){
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        //把栈中剩余的字符抛出
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        //转成字符串类型
        return sb.toString();
    }
}
