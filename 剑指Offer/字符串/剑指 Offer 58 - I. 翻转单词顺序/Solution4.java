package com.yang.string;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution4 {
    public String reverseWords(String s) {

        //按空格进行切割
        String[] arr = s.split(" ");

        //创建需要的长度StringBuilder
        StringBuilder sb =  new StringBuilder(arr.length);

        //循环添加进去
        for (int i = arr.length - 1; i >= 0; i--) {
            //判断如果不是""就添加进去,并且加个空格
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        //删除前后所有的空格
        return sb.toString().trim();

    }
}
