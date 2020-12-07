package com.liko.array;

import java.util.HashSet;

public class Solution13 {
    public boolean containsDuplicate(int[] nums) {

        if (nums.length == 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return set.size() != nums.length;
    }
}
