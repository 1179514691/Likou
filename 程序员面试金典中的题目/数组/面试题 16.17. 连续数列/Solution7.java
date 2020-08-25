package com.yang.array;

/*
    给定一个整数数组，找出总和最大的连续数列，并返回总和。
 */
public class Solution7 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE; //最大值
        int index = 0; //下标
        while (index < nums.length) {
            //和数 加 上当前下标的数 小于 当前下标的数
            if (sum + nums[index] < nums[index]) {
                //置为0
                sum = 0;
            }

            //相加
            sum += nums[index];

            if (sum > max) {
                //如果和数大于最大值,互换
                max = sum;
            }
            //下标移动1
            index++;
        }

        return max;
    }
}
