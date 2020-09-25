package com.yang.string;

public class Solution6 {
    public int strToInt(String str) {

        //去除前后空格
        String trim = str.trim();

        //没有任何字符
        if (trim.equals("")) {
            return 0;
        }

        byte sign = 1; //符号 默认加号
        int i = 0; //下标

        //判断第一个是不是符号
        if (trim.charAt(0) == '-' || trim.charAt(0) == '+') {
            sign = (byte) (trim.charAt(0) == '-' ?  -1 :  1);
            i = 1;
        }
        System.out.println((int)trim.charAt(i));

        long res = 0;

        for (; i < trim.length(); i++) {

            //不是数字
            //48对应的是0,47对应的是9
            if (trim.charAt(i) < 48 || trim.charAt(i) > 57) {
                break;
            }

            //叠加
            res = (res * 10) + (trim.charAt(i) - 48);

            //超过最大值或者最小值
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                //判断是什么符号 输出int的最大值或者最小值
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

        }

        return (int) (sign * res);
    }
}
