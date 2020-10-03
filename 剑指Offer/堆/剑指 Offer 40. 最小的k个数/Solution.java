package com.yang.heap;

import java.util.Arrays;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {

        if (k == 0) {
            return new int[0];
        }

        //ÅÅĞò
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;
    }

}
