package com.yang.Recursion;

import java.util.List;

public class Solution {

    /**
     *
     * @param A 原柱子
     * @param B 辅助柱子
     * @param C 目标柱子
     */
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        movePlate(A.size(),A,B,C);
    }

    private void movePlate(int num, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (num == 1) {
            //如果只有一个,直接把A移动到C
            C.add(A.remove(A.size() - 1));
            return;
        }



        //将A借助C移动到B
        movePlate(num - 1,A,C,B);
        //将A的最下面的一个移动到C
        C.add( A.remove( A.size() - 1));
        //将B借助A移动到C
        movePlate(num - 1,B,A ,C);

    }
}
