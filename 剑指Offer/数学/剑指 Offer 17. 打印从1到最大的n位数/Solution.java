package com.yang.math;

public class Solution {
    public int[] printNumbers(int n) {

        int digits = 10; //默认十位

        //当n大于1时,每次位数乘10
        for(int i = 1; i < n; i++) {
            digits *= 10;
        }

        //创建容量
        int[] res = new int[digits - 1];

        //循环存入值
        for (int i = 1; i < digits; i++) {
            res[i - 1] = i;
        }

        //返回结果
        return res;
    }
}
