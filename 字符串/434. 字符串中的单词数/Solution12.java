package com.liko.string;

import java.util.Arrays;

public class Solution12 {
    public int countSegments(String s) {
        //去掉前后空格
        String trim = s.trim();

        if (trim.length() == 0) {
            return 0;
        }

        //直接使用正则按空格一个或多个进行切割,然后获取它的长度
        return trim.split("\\s+").length;
    }

    public int countSegments2(String s) {
        //去掉前后空格
        String trim = s.trim();

        if (trim.length() == 0) {
            return 0;
        }

        //计数
        int count = 0;

        for(int i = 0; i < trim.length(); i++) {
            //反着判断...当我们i-1是空格,i不是空格就说明是单词
            if ( (i == 0 || trim.charAt(i-1) == ' ') && trim.charAt(i) != ' ') {
                count++;
            }
        }


        return count;
    }
}
