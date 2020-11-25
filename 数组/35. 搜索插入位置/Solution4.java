package com.liko.array;

public class Solution4 {
    public int searchInsert(int[] nums, int target) {


        if (nums[0] >= target) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < target && nums[i+1] >= target) {
                    return i+1;
                }
        }

        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {

        int l = 0;
        int r = nums.length -1;

        while(l <= r) {

            int mid = (l+r)/2;

            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }

        return l;
    }
}
