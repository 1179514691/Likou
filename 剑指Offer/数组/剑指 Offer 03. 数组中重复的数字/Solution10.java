package com.yang.array;

import java.util.HashSet;

public class Solution10 {
    public int findRepeatNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {

        int numsLen = nums.length;
        int[] temp = new int[numsLen];
        for (int i=0; i < numsLen; i++) {
            temp[nums[i]]++;
            if (temp[nums[i]] == 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
