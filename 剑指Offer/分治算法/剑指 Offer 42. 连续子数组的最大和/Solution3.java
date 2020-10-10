package com.yang.divideAndConquer;

public class Solution3 {
    public int maxSubArray(int[] nums) {

        //��װ��һ�������ֵ
        int max = nums[0];

        //��װ��һ���ǽ��
        int res = nums[0];

        //ѭ��
        for(int i = 1; i < nums.length; i++){
            //���ֵ,С��0
            if(max < 0) {
                max = nums[i];
            } else {
                //���ֵ���
                max += nums[i];
            }

            //�Ƚϼӹ������ֵ�Ƿ���ڽ����
            res = Math.max(res, max);
        }
        return res;
    }
}
