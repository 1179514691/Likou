package com.yang.other;

public class Solution2 {
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int oddIndex = 0; //奇数开始的下标
        int evenIndex = nums.length - 1; //偶数开始的下标
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2 == 0) {
               res[evenIndex--] = nums[i];
            }else {
                res[oddIndex++] = nums[i];
            }
        }
        return res;
    }

}
