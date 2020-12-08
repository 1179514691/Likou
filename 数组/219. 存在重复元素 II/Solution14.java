package com.liko.array;

import java.util.HashMap;

public class Solution14 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if(value != null && Math.abs(value - i) <= k) {
                return true;
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }


    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
