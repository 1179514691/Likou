package com.yang.array;

import java.util.Arrays;

/*
    数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 */
public class Solution8 {

    public int missingNumber(int[] nums) {

        int lack = 0; //缺少的总和

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            lack += nums[i];
        }

        int sum = length*(length+1)/2; //不缺的总和

        return sum - lack;
    }
}
