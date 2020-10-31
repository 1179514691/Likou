package com.liko.string;

public class Solution10 {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        int[] charCount = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            charCount[chars[i]-97]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (charCount[chars[i]-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
