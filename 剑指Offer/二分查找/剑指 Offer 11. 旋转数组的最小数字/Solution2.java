package com.yang.binarySearch;

import java.util.Arrays;

public class Solution2 {
    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public int minArray2(int[] numbers) {
        //左
        int i = 0;
        //右
        int j = numbers.length - 1;

        //循环条件
        while(i < j) {
            //获取中间节点
            int mid = (i + j) /2;
            //当中间节点大于 最右的节点
            if (numbers[mid] > numbers[j]) {
                //中间节点+1给左
                i = mid +1;
            }else if (numbers[mid] < numbers[j]) {
                //中间节点给到右
                j = mid;
            }else {
                //相等,右点1
                j--;
            }
        }
        //返回
        return numbers[i];
    }
}
