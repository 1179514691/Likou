package com.yang.string;

public class Solution5 {
    public String reverseLeftWords(String s, int n) {
        if (n == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseLeftWords2(String s, int n) {
        if (n == 0) {
            return s;
        }
        return s.substring(n)+s.substring(0,n);
    }
}
