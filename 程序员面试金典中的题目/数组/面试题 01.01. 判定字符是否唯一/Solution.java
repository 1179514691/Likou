package com.yang.array;

import java.util.HashSet;

/*
    实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
public class Solution {

    //思路1的解法
    public boolean isUnique(String astr) {
        //第一个循环用于整体的字符串的循环
        for (int i = 0; i < astr.length(); i++) {
            //第二个循环 i+ 1 是因为每次都是前一个与后一个进行比较,不需要和本身进行比较
            for (int j = i + 1; j < astr.length(); j++) {
                //如果相同直接返回false
               if (astr.charAt(i) == astr.charAt(j)) {
                   return false;
               }
            }
        }
        //循环结束表示没有相同的
        return true;
    }

    //思路2的解法
    public boolean isUnique2(String astr) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < astr.length(); i++) {
            set.add(astr.charAt(i));
            count++;
            if (set.size() != count) {
                return false;
            }
        }
        return true;
    }
}
