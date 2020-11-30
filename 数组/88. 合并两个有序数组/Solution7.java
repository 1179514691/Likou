package com.liko.array;

import java.util.Arrays;

public class Solution7 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < m+n; i++,j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;
        int p = nums1.length -1;
        int p2 = n -1;

        while(p2 >= 0 && p1 >= 0) {
           if (nums1[p1] < nums2[p2]) {
               nums1[p--] = nums2[p2--];
           }else {
               nums1[p--] = nums1[p1--];
           }
        }


        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }

    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {

        System.out.println(Arrays.toString(nums1));
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        int[] arr = new int[m+n];

        while(p2 < n && p1 < m) {
           if (nums1[p1] < nums2[p2]) {
               arr[p] = nums1[p1];
               p1++;
           }else {
               arr[p] = nums2[p2];
               p2++;
           }
            p++;
        }
        while (p1 < m) {
            arr[p++] = nums1[p1++];
        }
        while (p2 < n) {
            arr[p++] = nums2[p2++];
        }

        for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }

        System.out.println(Arrays.toString(nums1));

    }
}
