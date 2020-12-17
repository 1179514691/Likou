package com.liko.array;

public class Solution17 {
    public void moveZeroes(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //循环查找不是0的值
                while(nums[j] == 0 && j < nums.length -1){
                    j++;
                }

                //互换
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }else {
                j++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        //定义左右指针
        int l = 0, r = 0;

        //循环判断
        while(r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
    }
}
