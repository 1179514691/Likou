package com.yang.string;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public boolean canPermutePalindrome(String s) {


        //创建一个HashSet集合
        Set<Character> set = new HashSet<Character>();


        for (int i = 0; i < s.length(); i++) {

            //开始的长度
            int startSize = set.size();

            set.add(s.charAt(i));

            //比较两则的长度是否相同
            if (set.size() == startSize) {
                set.remove(s.charAt(i));
            }
        }

        //比较长度是否为1或者为0
        return set.size() == 1 || set.size() == 0;
    }

    public boolean canPermutePalindrome2(String s) {

        //创建一个数组,存储相同字符的个数
        int[] counts = new int[128];

        //循环存储
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }


        //标记个数
        int flag = 0;

        //循环比较
        for (int i = 0; i < counts.length; i++) {

            //如果是奇数,说明还有剩余
            if (counts[i] % 2 == 1) {
                flag++;
            }
            //只要剩余的个数大于1,就说明不是回文数了
            if (flag > 1) {
                return false;
            }

        }
        return true;
    }
}
