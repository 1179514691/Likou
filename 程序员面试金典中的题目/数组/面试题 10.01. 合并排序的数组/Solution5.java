package com.yang.array;

import java.util.Arrays;

/*
    ������������������ A �� B������ A ��ĩ�����㹻�Ļ���ռ����� B��
    ��дһ���������� B �ϲ��� A ������

    ��ʼ��A �� B ��Ԫ�������ֱ�Ϊm �� n

 */
public class Solution5 {

    public void merge(int[] A, int m, int[] B, int n) {

        int length = m + n;
        int index = 0;
        for (int i = m; i < length; i++) {
            A[i] = B[index++];
        }
        Arrays.sort(A);
    }

    public void merge2(int[] A, int m, int[] B, int n) {

        //���յĴ�С
        int length = m + n;

        //-1����Ϊ�±��Ǵ�0��ʼ, ���ֱ��length��Խ����
        for (int i = length -1; i >= 0; i--) {
            //�������鶼��ֵ
            if (m > 0 && n > 0) {
                if (A[m -1] < B[n-1] ) {
                    A[i] = B[--n];
                }else {
                    A[i] = A[--m];
                }
            }else if (n > 0 && m == 0) {
                //��һ�������ֵΪ0
                A[i] = B[--n];
            }
        }
    }


}
