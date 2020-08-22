package com.yang.array;

import java.util.Arrays;

/*
    给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。
    编写一个方法，将 B 合并入 A 并排序。

    初始化A 和 B 的元素数量分别为m 和 n

 */
public class Solution5 {

    public void merge(int[] A, int m, int[] B, int n) {

        int length = m + n;
        int index = 0;
        for (int i = m; i < length; i++) {
            A[i] = B[index++];
        }
        Arrays.sort(A);
    }

    public void merge2(int[] A, int m, int[] B, int n) {

        //最终的大小
        int length = m + n;

        //-1是因为下标是从0开始, 如果直接length就越界了
        for (int i = length -1; i >= 0; i--) {
            //两个数组都有值
            if (m > 0 && n > 0) {
                if (A[m -1] < B[n-1] ) {
                    A[i] = B[--n];
                }else {
                    A[i] = A[--m];
                }
            }else if (n > 0 && m == 0) {
                //第一个数组的值为0
                A[i] = B[--n];
            }
        }
    }


}
