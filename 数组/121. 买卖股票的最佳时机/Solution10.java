package com.liko.array;

public class Solution10 {
    public int maxProfit(int[] prices) {

        int max = 0;

        //每次用卖出的价钱 - 买入的价钱
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


        //最小买入
        int minprice  = Integer.MAX_VALUE;
        //最大卖出
        int maxprofit = 0;


        for (int i = 0; i < prices.length; i++) {
            //当前值小于 最小买入
            if (prices[i] < minprice) {
                minprice = prices[i];
                //比较当前值 减 最大卖出 大于 最大卖出值
            }else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }

        //返回最大卖出值
        return maxprofit;
    }
}
