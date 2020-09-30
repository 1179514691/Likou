package com.yang.array;

public class Solution14 {
    public int[] spiralOrder(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[0];
        }

        int top = 0; //��
        int bel = matrix.length - 1; //��
        int left = 0; //��
        int right = matrix[0].length -1; //��

        //��Ϊ����ĳ��Ϳ�����1����������Ҫ��1
        int[] result = new int[(bel + 1)*(right + 1)];
        int index = 0; //�±�

        while(true) {

            //��һ�� ��� �ƶ� �ұ�
            for (int i = left; i <= right; i++) {
                //top���� iһֱ������ ֱ�� �� �߽�
                result[index++] = matrix[top][i];
            }
            //ͷ�����ƶ�,�����Ƿ���ڵ���
            if (++top > bel) {
                break;
            }

            //��ʱ�� �� ������,
            //�� �� ��ֹͣ
            for (int i = top; i <= bel; i++) {
                //��ʱ���Ҳ���, ����ͷҪһֱ����
                result[index++] = matrix[i][right];
            }

            //��ʱ���ұߵ����ж�û����
            //�ж�����Ƿ�������ұ߼�1��
            if (left > --right) {
                break;
            }

            //��Ҫ�����µ��ұ� �� ��߱���
            for (int i = right; i >= left; i--) {
                //��ʱ���²���,�ұ������ƶ�
                result[index++] = matrix[bel][i];
            }

            //��ʱ�������Ѿ�ȫ���洢����,
            //�����������ƶ�һ��
            if (top > --bel) {
                break;
            }

            //��Ҫ�����µ����һֱ���ϱ���
            for (int i = bel; i >= top; i--) {
                //��ʱ������Ҫһֱ�ƶ�,�������󲻶�
                result[index++] = matrix[i][left];
            }
            //��ʱ����ߵ��Ѿ�ȫ���洢��,
            //���������ƶ�һ�бȽ�
            if (++left > right) {
                break;
            }
        }

        return result;

    }
}
