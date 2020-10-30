package com.liko.string;


public class Solution9 {
    public boolean canConstruct(String ransomNote, String magazine) {

        //�Ƚ�һ�³���,�����ǵ��ŵ��ַ�������־��,�Ϳ��Կ϶���false��
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        //�ֱ𴴽���������ַ��ĵ��ַ�����
        int[] ransomCharCount = new int[128];
        int[] magazineCharCount = new int[128];

        //��ransomNote���ַ�ȫ���ŵ�ransomCharCount��
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomCharCount[ransomNote.charAt(i)]++;
        }

        //��magazine���ַ�ȫ���ŵ�magazineCharCount��
        for (int i = 0; i < magazine.length(); i++) {
            magazineCharCount[magazine.charAt(i)]++;
        }


        //a��97,z��122
        for (int i = 97; i < 128; i++) {
            //�Ƚ������ַ�����Ĵ�С,������ŵ��ַ�������־���ַ��Ϳ���ֱ�ӷ���false
            if (ransomCharCount[i] > magazineCharCount[i]) {
                return false;
            }
        }


        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {

        //�Ƚ�һ�³���,�����ǵ��ŵ��ַ�������־��,�Ϳ��Կ϶���false��
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        //�ֱ𴴽���������ַ��ĵ��ַ�����
        int[] resultCharCount = new int[128];


        //��magazine���ַ�ȫ���ŵ�resultCharCountt��
        for (int i = 0; i < magazine.length(); i++) {
            resultCharCount[magazine.charAt(i)]++;
        }


        for (int i = 0; i < ransomNote.length(); i++) {
            //��ransomNote���ַ�����resultCharCount���ַ�
            resultCharCount[ransomNote.charAt(i)]--;
            //��resultCharCountС��0˵���Ѿ���������,����ֱ�ӷ���false
            if (resultCharCount[ransomNote.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

}
