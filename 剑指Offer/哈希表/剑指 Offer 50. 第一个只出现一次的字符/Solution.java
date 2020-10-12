package com.yang.hashTable;

public class Solution {
    public char firstUniqChar(String s) {

        //�洢�ַ�
        int[] count = new int[128];
        //ת�����ַ�
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            //�����±��¼����
            count[ch[i]]++;
        }

        for (int i = 0; i < s.length(); i++) {
            //�����±�Ѱ�Ҹ����Ƿ��е���1��
            if (count[ch[i]] == 1) {
                //��ֱ�ӷ���
                return ch[i];
            }
        }
        return ' ';
    }
}
