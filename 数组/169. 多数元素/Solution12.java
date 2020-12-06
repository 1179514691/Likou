package com.liko.array;

import java.util.HashMap;

public class Solution12 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            Integer value = map.get(nums[i]);
            value = value == null ? 0 : value + 1;
            if (value >= nums.length / 2) {
                return nums[i];
            }else {
                map.put(nums[i],value);
            }
        }
        return -1;
    }

    public int majorityElement2(int[] nums) {
        int count = 1;
        int res = nums[0];
       for (int i = 1; i < nums.length; i++) {
           if (nums[i] == res) {
               count++;
           }else {
               count--;
           }
           if (count < 1) {
               count = 1;
               res = nums[i];
           }
       }

       return res;
    }
}
