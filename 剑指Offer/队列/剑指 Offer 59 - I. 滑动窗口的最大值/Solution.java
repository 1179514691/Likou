package com.yang.queue;

import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int len = nums.length; //��ȡ����

        //����Ϊ0ֱ�ӷ���0
        if ( len == 0) {
            return new int[0];
        }

        //����һ����������ģ��ջ
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //������������
        int[] res = new int[len - k +1];

        //�������±�
        int index = 0;

        //������ĵ�һ������ջ
        queue.addLast(nums[0]);
        //�Ȱ������һ���������ֵ
        int max = nums[0];


        for (int i = 1; i < len; i++) {
            //�ж��Ƿ��Ѿ���k���ڴ�С
            if (queue.size() != k) {
                //û��,�Ƚ����ֵ
                if (max < nums[i]) {
                    //���ֵС�ڵ�ǰ��ֵ,�ͽ����滻
                    max = nums[i];
                }
                //��ӵ����
                queue.addLast(nums[i]);
            }else {

                //���ֵ���뵽���
                res[index++] = max;

                //����,�׳��Ƚ���ֵ,�����ж��Ƿ������ֵ
                if (max == queue.removeFirst()) {
                    //��������ֵ,�Ͱ����һ������Ϊ���ֵ
                    max = nums[i];
                    //ѭ���Ĵ���
                    int count = 1;

                    //ѭ��ʣ���ջ�е����ֵ
                    //��Ϊ���һ���Ѿ�������, ����Ҫ�Ѵ���k�� -1�ν����ж�
                    while(count <= k - 1) {

                        //���űȽ�,���С��
                        if (max < nums[i-count]) {
                           //�ͽ����滻
                            max = nums[i-count];
                        }

                        count++;
                    }

                    //������ֵС����ӵ�ֵ
                }else if (max < nums[i]) {
                    //�����滻
                    max = nums[i];
                }
                //��ֵ,��ӵ����
                    queue.addLast(nums[i]);
            }

        }

        //�������һ�ε�
        res[index] = max;

        //���ؽ��
        return res;
    }
}
