package com.liko.string;

public class Solution16 {
    public boolean checkRecord(String s) {
        int countA = 0; //ͳ��ȱ�ڴ���
        int countL = 0; //ͳ�Ƴٵ�����

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    //ȱ��++
                    countA++;
                    //����ȱ��ʱ,˵�������ٵ��Ĵ����Ͷ���,������Ϊ0
                    countL = 0;
                    break;
                case 'L':
                    //�ٵ�++
                    countL++;
                    break;
                case 'P':
                    //���ǵ���ʱ,˵�������ٵ��Ĵ����Ͷ���,������Ϊ0
                    countL = 0;
                    break;
            }
            //�ж��Ƿ������ٵ��Լ�ȱ���Ƿ񳬹�1
            if (countL > 2 || countA >= 2) {
                return false;
            }

        }
        return true;
    }
}
