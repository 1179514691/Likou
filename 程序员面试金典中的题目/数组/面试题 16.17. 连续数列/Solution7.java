package com.yang.array;

/*
    ����һ���������飬�ҳ��ܺ������������У��������ܺ͡�
 */
public class Solution7 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE; //���ֵ
        int index = 0; //�±�
        while (index < nums.length) {
            //���� �� �ϵ�ǰ�±���� С�� ��ǰ�±����
            if (sum + nums[index] < nums[index]) {
                //��Ϊ0
                sum = 0;
            }

            //���
            sum += nums[index];

            if (sum > max) {
                //��������������ֵ,����
                max = sum;
            }
            //�±��ƶ�1
            index++;
        }

        return max;
    }
}
