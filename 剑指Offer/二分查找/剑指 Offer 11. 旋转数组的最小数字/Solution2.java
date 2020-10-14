package com.yang.binarySearch;

import java.util.Arrays;

public class Solution2 {
    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public int minArray2(int[] numbers) {
        //��
        int i = 0;
        //��
        int j = numbers.length - 1;

        //ѭ������
        while(i < j) {
            //��ȡ�м�ڵ�
            int mid = (i + j) /2;
            //���м�ڵ���� ���ҵĽڵ�
            if (numbers[mid] > numbers[j]) {
                //�м�ڵ�+1����
                i = mid +1;
            }else if (numbers[mid] < numbers[j]) {
                //�м�ڵ������
                j = mid;
            }else {
                //���,�ҵ�1
                j--;
            }
        }
        //����
        return numbers[i];
    }
}
