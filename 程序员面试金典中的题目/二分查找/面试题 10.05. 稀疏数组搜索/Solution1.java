package com.yang.binarySearch;

import java.util.HashMap;

public class Solution1 {

    public int findString(String[] words, String s) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],i);
        }
        Integer result = map.get(s);

        if (result == null) {
            return -1;
        }
        return result;
    }

    public int findString2(String[] words, String s) {

        int hit = 0;

        for (int i=0; i < words.length; i++) {
            //统计不等于空的字符串
            if (!words[i].equals("")) {
                hit++;
            }
        }


        String[][] remaining = new String[hit][2];
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            //存储不等于空的字符串
            if (!words[i].equals("")) {
                remaining[index][0] = words[i];
                remaining[index][1] = i+"";
                index++;
            }
        }

        //查找压缩过后的二维数组
        for (int i = 0; i < hit; i++) {
            if (s.equals(remaining[i][0])) {
                return Integer.parseInt(remaining[i][1]);
            }
        }

        return -1;

    }

}
