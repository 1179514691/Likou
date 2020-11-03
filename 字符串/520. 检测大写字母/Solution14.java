package com.liko.string;

public class Solution14 {
    public boolean detectCapitalUse(String word) {
        int UpperCaseCount = 0; //��д��ĸ����
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                UpperCaseCount++;
            }
        }

        //�ܵĸ��� - ��д��ĸ = Сд��ĸ
        int lowerCaseCount = word.length() - UpperCaseCount; //Сд��ĸ����

        //ȫ�����Ǵ�д
        if (UpperCaseCount == word.length()) {
            return true;
        }

        //ȫ������Сд
        if (lowerCaseCount == word.length()) {
            return true;
        }

        //��д��ĸһ�� ���� ��һ������ĸ����Z����С��Z
        if (UpperCaseCount == 1 && word.charAt(0) <= 'Z' ) {
            return true;
        }

        return false;
    }
}
