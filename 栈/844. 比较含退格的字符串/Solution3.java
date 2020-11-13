package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {

    public boolean backspaceCompare(String S, String T) {


        //S�ַ����˸�
        String backspaceS = backspace(S);
        //T�ַ����˸�
        String backspaceT = backspace(T);

        //�ж�����ջ�Ƿ�Ϊ��
        return backspaceS.equals(backspaceT);


    }
    public boolean backspaceCompare2(String S, String T) {
        //S�ַ����˸�
        String backspaceS = backspace2(S);
        //T�ַ����˸�
        String backspaceT = backspace2(T);

        //�ж�����ջ�Ƿ�Ϊ��
        return backspaceS.equals(backspaceT);
    }

    public boolean backspaceCompare3(String S, String T) {
        //S�����ڵ�
        int i = S.length() -1;
        //S����#�Ĵ���
        int  skipS = 0;
        //T�����ڵ�
        int j = T.length() -1;
        //T����#�Ĵ���
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
     * @param s ��Ҫ�˸���ַ���
     * @return �����ַ���
     */
    private String backspace(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        //ת�����ַ�����
        char[] ch = s.toCharArray();

        for (int i = 0; i  < ch.length; i++) {
            //�������#����ջ
            if (ch[i] != '#') {
                stack.push(ch[i]);
                //��#���ж�һ��ջ�Ƿ�Ϊ��,��Ϊ�վ��׳�
            }else if (!stack.isEmpty()){
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        //��ջ��ʣ����ַ��׳�
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        //ת���ַ�������
        return sb.toString();
    }
}
