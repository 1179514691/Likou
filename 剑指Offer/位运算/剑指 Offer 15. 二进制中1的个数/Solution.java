package com.yang.bitManipution;

public class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public int hammingWeight2(int n) {
        int res = 0;
        int count = 0;
        while(n != 0) {
            //Óë1
            res = n & 1;

            if (res == 1) {
                count++;
            }

            //ÏòÓÒÒÆ
            n >>>= 1;
        }
        return count;
    }
}
