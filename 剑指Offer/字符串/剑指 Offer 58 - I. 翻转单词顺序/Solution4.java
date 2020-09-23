package com.yang.string;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution4 {
    public String reverseWords(String s) {

        //���ո�����и�
        String[] arr = s.split(" ");

        //������Ҫ�ĳ���StringBuilder
        StringBuilder sb =  new StringBuilder(arr.length);

        //ѭ����ӽ�ȥ
        for (int i = arr.length - 1; i >= 0; i--) {
            //�ж��������""����ӽ�ȥ,���ҼӸ��ո�
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        //ɾ��ǰ�����еĿո�
        return sb.toString().trim();

    }
}
