package com.liko.array;

import java.util.ArrayList;
import java.util.List;

public class Solution8 {
    public List<List<Integer>> generate(int numRows) {

        //����һ��Lists���洢list
        List<List<Integer>> lists = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            //ÿ�δ���һ��list������
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                //�ж��ǲ��ǵ�һ�������һ��
                if (j == 0 || j== i) {
                    //�����ֱ�����1
                    list.add(1);
                }else {
                    //��ȡ��һ�е�list,Ȼ���ȡ�����±�
                    //����j�ǲ������0��,��Ϊ�����Ѿ��ж���,�������������
                    //�����ǵ�����iΪ2,jΪ1��ʱ��
                    //i-1Ҳ����2-1,�ͻ�ȡ�˵ڶ��е�,Ȼ���ȡ����ֵj-1Ҳ����1-1
                    //Ҳ�ͻ�ȡ�˵ڶ��е�һ��,�õ�1,Ȼ���ͬ���ĵڶ��еĵڶ���
                    //i-1Ҳ����2-1,����jΪ1Ҳ���ǵڶ��еĵڶ���
                    //����Ҫ����Խ������,��Ϊ��������һ��,ͬ������ִ��������
                    list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }
            }
            //��list��������ӵ�lists��
            lists.add(list);
        }
        return lists;
    }
}
