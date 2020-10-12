package com.yang.hashTable;

public class Solution {
    public char firstUniqChar(String s) {

        //存储字符
        int[] count = new int[128];
        //转换长字符
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            //根据下标记录个数
            count[ch[i]]++;
        }

        for (int i = 0; i < s.length(); i++) {
            //按照下标寻找个数是否有等于1的
            if (count[ch[i]] == 1) {
                //有直接返回
                return ch[i];
            }
        }
        return ' ';
    }
}
