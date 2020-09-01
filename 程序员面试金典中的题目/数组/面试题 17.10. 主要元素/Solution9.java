package com.yang.array;

import java.util.HashSet;
import java.util.List;

/*
    ������ռ�ȳ���һ���Ԫ�س�֮Ϊ��ҪԪ�ء�����һ���������飬�ҵ�������ҪԪ�ء���û�У�����-1
 */
public class Solution9 {
    public int majorityElement(int[] nums) {
        //����һ��Set����
        HashSet<Integer> set = new HashSet<Integer>();

        //�洢��set��������
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int count = 0; //��¼Ԫ�صĸ���
        int result = -1; //���

        for (Integer data : set) {
            for (int i = 0; i < nums.length; i++) {
                if (data == nums[i]) {
                    result = nums[i];
                    count++;
                }
            }
            //��������������鳤�ȵ�һ��,ֱ�ӽ���ѭ��
            if (count -1 > nums.length /2) {
                break;
            }else {
                result = -1; //����Ϊ-1
                count = 0; //���¼�¼
            }
        }

        return result;
    }

    public int majorityElement2(int[] nums) {

        int value = nums[0]; //����һ��ʼֵ
        int count = 1; //����

        //Ħ��ͶƱ�㷨
        for (int i = 0; i < nums.length; i++) {

            if (value == nums[i]) {
                count++;
            }else {
                count--;
            }

            if (count == 0) {
                value = nums[i];
                count = 1;
            }
        }

        //�Ƚ���ͬ��ֵ
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                count++;
            }


            //��ͬ��ֵ�Ƿ����������һ��
            if (count > nums.length/2) {
                return value;
            }
        }

        return -1;
    }
}
