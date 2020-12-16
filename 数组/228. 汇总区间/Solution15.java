package com.liko.array;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        for(int start = 0, end = 0; end < nums.length; end++) {

            //避免越界,并且判断当前的数组+1,是否等于下一个数组的值
            if(end + 1 < nums.length && nums[end] + 1 == nums[end+1]) {
                continue;
            }
            //说明上面的不成立,也就是不连续
            if (start == end) {
                list.add(nums[start]+"");
            }else {
                //说明有一段连续的,但是下一个不连续
                list.add(nums[start]+"->"+nums[end]);
            }

            //把那个下一个不连续的过度一下
            start = end + 1;
        }
        return list;
    }
}
