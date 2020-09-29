package com.yang.array;

public class Solution13 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        //判断行数是否为0
        if(matrix.length == 0) {
            return false;
        }


        //不为0就遍历行数
        for (int i = 0; i < matrix.length; i++) {

            //行数里面的列不为0再继续
            if (matrix[i].length != 0) {
                //左为0
                int left = 0;
                //右为行的列长度-1
                int right = matrix[i].length -1;

                //二分查找
                while(left <= right) {
                    //取中间
                    int mid = (left + right )/2;

                    //找到直接返回true
                    if (matrix[i][mid] == target) {
                        return true;

                        //大于直接向左移
                    }else if (matrix[i][mid] > target) {
                        right = mid -1;
                    }else {
                        //小于 向右移
                        left = mid + 1;
                    }
                }
            }
        }

        //能全部执行完,说明没有,直接返回false
        return false;
    }
}
