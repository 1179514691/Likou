package com.liko.array;

public class Solution6 {
    public int maxSubArray(int[] nums) {


        int res = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            res = Math.max(res,sum);
        }

        return res;
    }
}
