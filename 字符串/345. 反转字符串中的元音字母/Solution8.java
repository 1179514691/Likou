package com.liko.string;

import java.util.Arrays;

public class Solution8 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l =0;   //��ָ��
        int r = chars.length - 1; //��ָ��

        //����ָ�������ָ��ͽ���ѭ��
        while(l < r) {
            //�ж���ָ���Ƿ���Ԫ����ĸ,���Ǿͼ�
            if (isVowel(chars[l])){
                l++;
                continue;
            }

            //�ж���ָ���Ƿ���Ԫ����ĸ,���Ǿͼ�
           if (isVowel(chars[r])) {
               r--;
               continue;
           }
           //Ԫ����ĸ����
            chars[l] = (char) (chars[l] + chars[r]);
            chars[r] = (char) (chars[l] - chars[r]);
            chars[l] = (char) (chars[l] - chars[r]);
//            char temp = chars[l];
//            chars[l] = chars[r];
//            chars[r] = temp;
            l++;
            r--;

        }
        return new String(chars);
    }

    /**
     *
     * @param c �����жϵ��ַ�
     * @return Ԫ����ĸ����false ���Ƿ���true;
     */
    private boolean isVowel(char c) {
        switch(c) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                return false;
        }
        return true;
    }
}
