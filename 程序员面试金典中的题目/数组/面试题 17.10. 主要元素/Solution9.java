package com.yang.array;

import java.util.HashSet;
import java.util.List;

/*
    数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1
 */
public class Solution9 {
    public int majorityElement(int[] nums) {
        //创建一个Set集合
        HashSet<Integer> set = new HashSet<Integer>();

        //存储到set集合里面
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int count = 0; //记录元素的个数
        int result = -1; //结果

        for (Integer data : set) {
            for (int i = 0; i < nums.length; i++) {
                if (data == nums[i]) {
                    result = nums[i];
                    count++;
                }
            }
            //如果个数大于数组长度的一般,直接结束循环
            if (count -1 > nums.length /2) {
                break;
            }else {
                result = -1; //重置为-1
                count = 0; //重新记录
            }
        }

        return result;
    }
}
