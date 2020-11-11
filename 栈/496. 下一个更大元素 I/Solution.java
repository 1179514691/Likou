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
            //比较下标是否越界,以及是否小于
            if (index < nums2.length) {
                for (int j = index; j < nums2.length; j++) {
                    if (nums1[i] < nums2[j]) {
                        //成立就赋值
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
                //不成立赋值-1
                res[i] = -1;
            }
        }
        return res;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        //创建一个栈
        Deque<Integer> stack = new ArrayDeque<>();
        //创建一个hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        //创建一个结果集
        int[] res = new int[nums1.length];

        for (int i = nums2.length -1; i >= 0; i--) {
            //栈不为空并且栈的值小于等于的值就进行pop
            while(!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            //判断栈是否存在,不存在-1,存在,把对应的值返回
            int value =  stack.isEmpty()  ? -1 : stack.peek();
            //存放到map中
            map.put(nums2[i],value);
            //把当前值进行push
            stack.push(nums2[i]);
        }

        //循环获取,把值存放到结果集中
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        //返回
        return res;
    }

    /**
     *
     * @param value 数组1的值
     * @param num2 数组2
     * @return 查询到了返回+1后的下标,查询不到直接返回-1
     */
    private int findNum2Index(int value, int[] num2) {
        for (int i = 0; i < num2.length; i++) {
            //找到对应的值
            if (value == num2[i]) {
                //下标+1返回
                return i+1;
            }
        }
        return -1;
    }

}
