package com.liko.array;

import java.util.Arrays;

public class Solution16 {
    public int missingNumber(int[] nums) {

        //�Ƚ�������
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public int missingNumber2(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //��˹��͹�ʽ
        int sum2 = (nums.length*(nums.length+1))/2;
//        int sum2 = 0;
//        for (int i = 0; i < nums.length+1; i++) {
//            sum2 += i;
//        }


        return sum2 - sum;
    }
}
