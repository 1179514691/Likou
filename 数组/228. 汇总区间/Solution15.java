package com.liko.array;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        for(int start = 0, end = 0; end < nums.length; end++) {

            //����Խ��,�����жϵ�ǰ������+1,�Ƿ������һ�������ֵ
            if(end + 1 < nums.length && nums[end] + 1 == nums[end+1]) {
                continue;
            }
            //˵������Ĳ�����,Ҳ���ǲ�����
            if (start == end) {
                list.add(nums[start]+"");
            }else {
                //˵����һ��������,������һ��������
                list.add(nums[start]+"->"+nums[end]);
            }

            //���Ǹ���һ���������Ĺ���һ��
            start = end + 1;
        }
        return list;
    }
}
