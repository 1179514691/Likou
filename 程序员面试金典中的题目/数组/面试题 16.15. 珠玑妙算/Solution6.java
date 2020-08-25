package com.yang.array;

import java.util.ArrayList;
import java.util.List;

/*
    �������4���ۣ�ÿ���۷�һ������ɫ�����Ǻ�ɫ��R������ɫ��Y������ɫ��G������ɫ��B����
    ���磬�����������RGGB 4�֣���1Ϊ��ɫ����2��3Ϊ��ɫ����4Ϊ��ɫ������Ϊ�û�������ͼ�³���ɫ��ϡ�
    ����ȷ�������ܻ��YRGB��Ҫ�ǲ¶�ĳ���۵���ɫ������һ�Ρ����С���Ҫ��ֻ�¶���ɫ����λ�´��ˣ�����һ�Ρ�α���С���
    ע�⣬�����С��������롰α���С���

 */
public class Solution6 {
    public int[] masterMind(String solution, String guess) {

        char[] c1 = solution.toCharArray(); //ת�����ַ�����
        char[] c2 = guess.toCharArray(); //ת�����ַ�����
        int[] result = new int[2];  //���
        int[] answer = new int[4]; // 0��ʾû�в���, 1��ʾ����, 2��ʾα����

        for (int i = 0; i < 4; i++) {
            if (c1[i] == c2[i]) { //�ж��Ƿ����
                answer[i] = 1;  //���� ��Ϊ1
                result[0]++; //���+1
            }else {
                for (int j = 0; j < 4; j++) {
                    if (i == j) { //��ʾ�����Ƿ���ͬ, �����Ѿ��ȽϹ���,���ֱ������
                        continue;
                    }
                    //�ж��Ƿ�α����,�����Ƿ���û�б�ǵ�,���Ҳ��ǲ���
                    if (c1[i] == c2[j] && answer[j] == 0 && c1[j] != c2[j]) {
                        answer[j] = 2; //��Ϊ2
                        result[1]++;   //���+1
                        break;
                    }
                }
            }
        }


        return result;
    }
}
