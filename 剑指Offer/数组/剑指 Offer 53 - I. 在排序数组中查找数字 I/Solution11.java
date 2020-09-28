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

    public int search2(int[] nums, int target) {
        if(nums.length <= 0) {
            return 0;
        }

        int tempLeft = 0;
        int tempRight = nums.length - 1;
        while(tempLeft <= tempRight) {
            int mid = (tempLeft + tempRight) / 2;
            if (nums[mid] <= target) {
                tempLeft = mid+1;
            }else {
                tempRight = mid - 1;
            }
        }

        //把最右点给到右
        int right = tempLeft;

        //重新赋值
        tempLeft = 0;
        tempRight = nums.length - 1;

        while (tempLeft <= tempRight) {
            int mid = (tempLeft + tempRight) / 2;
            if (nums[mid] < target) {
                tempLeft = mid+1;
            }else {
                tempRight = mid - 1;
            }
        }

        //把最左点给到左
        int left = tempRight;



        return right - left -1;
    }

}
