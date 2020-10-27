package com.liko.string;

public class Solution6 {
    public boolean isPalindrome(String s) {

        //ͳһת����Сд
        String lowerCaseStr = s.toLowerCase();

        //ת�����ַ�����
        char[] chars = lowerCaseStr.toCharArray();
        int l = 0;  //��
        int r = chars.length -1; //��

        while(l < r) {
            //�������0��9 ���� 97(a) �� 122(z) ֱ�ӹ���
            if (chars[l] < '0' || (chars[l] > '9' && chars[l] < 'a') || chars[l] > 'z'){
                l++;
                continue;
            }
            if (chars[r] < '0' || (chars[r] > '9' && chars[r] < 'a') || chars[r] > 'z') {
                r--;
                continue;
            }
            //�ж������Ƿ���ͬ
            if (chars[l] == chars[r]) {
                l++;
                r--;
            }else {
                return false;
            }
        }

        return true;
    }
}
