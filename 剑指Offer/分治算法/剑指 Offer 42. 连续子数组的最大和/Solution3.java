package com.yang.divideAndConquer;

public class Solution3 {
    public int maxSubArray(int[] nums) {

        //假装第一个是最大值
        int max = nums[0];

        //假装第一个是结果
        int res = nums[0];

        //循环
        for(int i = 1; i < nums.length; i++){
            //最大值,小于0
            if(max < 0) {
                max = nums[i];
            } else {
                //最大值相加
                max += nums[i];
            }

            //比较加过的最大值是否大于结果集
            res = Math.max(res, max);
        }
        return res;
    }
}
