package com.liko.array;

public class Solution10 {
    public int maxProfit(int[] prices) {

        int max = 0;

        //ÿ���������ļ�Ǯ - ����ļ�Ǯ
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (max < prices[j] - prices[i]) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {


        //��С����
        int minprice  = Integer.MAX_VALUE;
        //�������
        int maxprofit = 0;


        for (int i = 0; i < prices.length; i++) {
            //��ǰֵС�� ��С����
            if (prices[i] < minprice) {
                minprice = prices[i];
                //�Ƚϵ�ǰֵ �� ������� ���� �������ֵ
            }else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }

        //�����������ֵ
        return maxprofit;
    }
}
