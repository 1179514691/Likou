package com.yang.array;

import java.util.Arrays;

/*
    ����nums������0��n������������������ȱ��һ�������д�����ҳ��Ǹ�ȱʧ�����������а취��O(n)ʱ���������
 */
public class Solution8 {

    public int missingNumber(int[] nums) {

        int lack = 0; //ȱ�ٵ��ܺ�

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            lack += nums[i];
        }

        int sum = length*(length+1)/2; //��ȱ���ܺ�

        return sum - lack;
    }
}
