package com.yang.math;

public class Solution {
    public int[] printNumbers(int n) {

        int digits = 10; //Ĭ��ʮλ

        //��n����1ʱ,ÿ��λ����10
        for(int i = 1; i < n; i++) {
            digits *= 10;
        }

        //��������
        int[] res = new int[digits - 1];

        //ѭ������ֵ
        for (int i = 1; i < digits; i++) {
            res[i - 1] = i;
        }

        //���ؽ��
        return res;
    }
}
