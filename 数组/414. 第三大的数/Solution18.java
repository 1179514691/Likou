package com.liko.array;

public class Solution18 {
    public int thirdMax(int[] nums) {

        long top1 = Long.MIN_VALUE;
        long top2 = Long.MIN_VALUE;
        long top3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > top3 && nums[i] != top2 && nums[i] != top1) {
                top3 = nums[i];
                if (top2 < top3) {
                    top3 = top2;
                    top2 = nums[i];
                    if (top1 < top2) {
                        top2 = top1;
                        top1 = nums[i];
                    }
                }
            }

        }
        return (int)(top3 == Long.MIN_VALUE ? top1 : top3);
    }
}
