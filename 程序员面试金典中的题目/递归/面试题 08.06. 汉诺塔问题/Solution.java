package com.yang.Recursion;

import java.util.List;

public class Solution {

    /**
     *
     * @param A ԭ����
     * @param B ��������
     * @param C Ŀ������
     */
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        movePlate(A.size(),A,B,C);
    }

    private void movePlate(int num, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (num == 1) {
            //���ֻ��һ��,ֱ�Ӱ�A�ƶ���C
            C.add(A.remove(A.size() - 1));
            return;
        }



        //��A����C�ƶ���B
        movePlate(num - 1,A,C,B);
        //��A���������һ���ƶ���C
        C.add( A.remove( A.size() - 1));
        //��B����A�ƶ���C
        movePlate(num - 1,B,A ,C);

    }
}
