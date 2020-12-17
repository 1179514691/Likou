package com.liko.array;

public class Solution17 {
    public void moveZeroes(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //ѭ�����Ҳ���0��ֵ
                while(nums[j] == 0 && j < nums.length -1){
                    j++;
                }

                //����
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }else {
                j++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        //��������ָ��
        int l = 0, r = 0;

        //ѭ���ж�
        while(r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
    }
}
