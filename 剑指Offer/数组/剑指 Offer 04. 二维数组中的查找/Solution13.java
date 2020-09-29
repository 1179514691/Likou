package com.yang.array;

public class Solution13 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        //�ж������Ƿ�Ϊ0
        if(matrix.length == 0) {
            return false;
        }


        //��Ϊ0�ͱ�������
        for (int i = 0; i < matrix.length; i++) {

            //����������в�Ϊ0�ټ���
            if (matrix[i].length != 0) {
                //��Ϊ0
                int left = 0;
                //��Ϊ�е��г���-1
                int right = matrix[i].length -1;

                //���ֲ���
                while(left <= right) {
                    //ȡ�м�
                    int mid = (left + right )/2;

                    //�ҵ�ֱ�ӷ���true
                    if (matrix[i][mid] == target) {
                        return true;

                        //����ֱ��������
                    }else if (matrix[i][mid] > target) {
                        right = mid -1;
                    }else {
                        //С�� ������
                        left = mid + 1;
                    }
                }
            }
        }

        //��ȫ��ִ����,˵��û��,ֱ�ӷ���false
        return false;
    }
}
