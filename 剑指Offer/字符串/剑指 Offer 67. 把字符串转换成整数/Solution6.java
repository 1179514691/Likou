package com.yang.string;

public class Solution6 {
    public int strToInt(String str) {

        //ȥ��ǰ��ո�
        String trim = str.trim();

        //û���κ��ַ�
        if (trim.equals("")) {
            return 0;
        }

        byte sign = 1; //���� Ĭ�ϼӺ�
        int i = 0; //�±�

        //�жϵ�һ���ǲ��Ƿ���
        if (trim.charAt(0) == '-' || trim.charAt(0) == '+') {
            sign = (byte) (trim.charAt(0) == '-' ?  -1 :  1);
            i = 1;
        }
        System.out.println((int)trim.charAt(i));

        long res = 0;

        for (; i < trim.length(); i++) {

            //��������
            //48��Ӧ����0,47��Ӧ����9
            if (trim.charAt(i) < 48 || trim.charAt(i) > 57) {
                break;
            }

            //����
            res = (res * 10) + (trim.charAt(i) - 48);

            //�������ֵ������Сֵ
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                //�ж���ʲô���� ���int�����ֵ������Сֵ
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

        }

        return (int) (sign * res);
    }
}
