package com.liko.string;

public class Solution7 {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while(l < r) {
            s[l] = (char)(s[l] + s[r]);
            s[r] = (char)(s[l] - s[r]);
            s[l] = (char)(s[l] - s[r]);
            l++;
            r--;
        }
    }

    public void reverseString2(char[] s) {
        for (int l = 0, r = s.length -1; l < r; l++,r--) {
            s[l] = (char)(s[l] + s[r]);
            s[r] = (char)(s[l] - s[r]);
            s[l] = (char)(s[l] - s[r]);
        }

    }
}
