package com.liko.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        boolean flag = false;

        for (int i = 0; i < nums1.length; i++) {
            int index = findNum2Index(nums1[i], nums2);
            //�Ƚ��±��Ƿ�Խ��,�Լ��Ƿ�С��
            if (index < nums2.length) {
                for (int j = index; j < nums2.length; j++) {
                    if (nums1[i] < nums2[j]) {
                        //�����͸�ֵ
                        res[i] = nums2[j];
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if (flag) {
                    res[i] = -1;
                }
            }else {
                //��������ֵ-1
                res[i] = -1;
            }
        }
        return res;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        //����һ��ջ
        Deque<Integer> stack = new ArrayDeque<>();
        //����һ��hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        //����һ�������
        int[] res = new int[nums1.length];

        for (int i = nums2.length -1; i >= 0; i--) {
            //ջ��Ϊ�ղ���ջ��ֵС�ڵ��ڵ�ֵ�ͽ���pop
            while(!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            //�ж�ջ�Ƿ����,������-1,����,�Ѷ�Ӧ��ֵ����
            int value =  stack.isEmpty()  ? -1 : stack.peek();
            //��ŵ�map��
            map.put(nums2[i],value);
            //�ѵ�ǰֵ����push
            stack.push(nums2[i]);
        }

        //ѭ����ȡ,��ֵ��ŵ��������
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        //����
        return res;
    }

    /**
     *
     * @param value ����1��ֵ
     * @param num2 ����2
     * @return ��ѯ���˷���+1����±�,��ѯ����ֱ�ӷ���-1
     */
    private int findNum2Index(int value, int[] num2) {
        for (int i = 0; i < num2.length; i++) {
            //�ҵ���Ӧ��ֵ
            if (value == num2[i]) {
                //�±�+1����
                return i+1;
            }
        }
        return -1;
    }

}
