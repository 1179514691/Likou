package com.liko.string;

public class Solution14 {
    public boolean detectCapitalUse(String word) {
        int UpperCaseCount = 0; //大写字母个数
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                UpperCaseCount++;
            }
        }

        //总的个数 - 大写字母 = 小写字母
        int lowerCaseCount = word.length() - UpperCaseCount; //小写字母个数

        //全部都是大写
        if (UpperCaseCount == word.length()) {
            return true;
        }

        //全部都是小写
        if (lowerCaseCount == word.length()) {
            return true;
        }

        //大写字母一个 并且 第一个的字母等于Z或者小于Z
        if (UpperCaseCount == 1 && word.charAt(0) <= 'Z' ) {
            return true;
        }

        return false;
    }
}
