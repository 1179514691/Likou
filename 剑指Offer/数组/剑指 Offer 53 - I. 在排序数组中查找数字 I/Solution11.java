package com.yang.array;

public class Solution11 {
    public int search(int[] nums, int target) {

        int count = 0; //出现次数

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

}
