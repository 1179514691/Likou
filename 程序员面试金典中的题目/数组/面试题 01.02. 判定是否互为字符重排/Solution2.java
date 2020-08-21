package com.yang.array;


import java.util.Arrays;

/*
    给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */
public class Solution2 {

    public boolean CheckPermutation(String s1, String s2) {

        //判断长度是否相等
        if (s1.length() != s2.length()) {
            return false;
        }

        //变成字符数组
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        //排序
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.toString(c1).equals(Arrays.toString(c2));
    }

}
