package com.liko.string;

import java.util.Arrays;

public class Solution12 {
    public int countSegments(String s) {
        //ȥ��ǰ��ո�
        String trim = s.trim();

        if (trim.length() == 0) {
            return 0;
        }

        //ֱ��ʹ�����򰴿ո�һ�����������и�,Ȼ���ȡ���ĳ���
        return trim.split("\\s+").length;
    }

    public int countSegments2(String s) {
        //ȥ��ǰ��ո�
        String trim = s.trim();

        if (trim.length() == 0) {
            return 0;
        }

        //����
        int count = 0;

        for(int i = 0; i < trim.length(); i++) {
            //�����ж�...������i-1�ǿո�,i���ǿո��˵���ǵ���
            if ( (i == 0 || trim.charAt(i-1) == ' ') && trim.charAt(i) != ' ') {
                count++;
            }
        }


        return count;
    }
}
