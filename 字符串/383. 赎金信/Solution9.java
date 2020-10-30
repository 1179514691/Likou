package com.liko.string;


public class Solution9 {
    public boolean canConstruct(String ransomNote, String magazine) {

        //比较一下长度,当我们的信的字符大于杂志的,就可以肯定是false了
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        //分别创建两个存放字符的的字符数组
        int[] ransomCharCount = new int[128];
        int[] magazineCharCount = new int[128];

        //把ransomNote的字符全部放到ransomCharCount中
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomCharCount[ransomNote.charAt(i)]++;
        }

        //把magazine的字符全部放到magazineCharCount中
        for (int i = 0; i < magazine.length(); i++) {
            magazineCharCount[magazine.charAt(i)]++;
        }


        //a是97,z是122
        for (int i = 97; i < 128; i++) {
            //比较两个字符数组的大小,当赎金信的字符大于杂志的字符就可以直接返回false
            if (ransomCharCount[i] > magazineCharCount[i]) {
                return false;
            }
        }


        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {

        //比较一下长度,当我们的信的字符大于杂志的,就可以肯定是false了
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        //分别创建两个存放字符的的字符数组
        int[] resultCharCount = new int[128];


        //把magazine的字符全部放到resultCharCountt中
        for (int i = 0; i < magazine.length(); i++) {
            resultCharCount[magazine.charAt(i)]++;
        }


        for (int i = 0; i < ransomNote.length(); i++) {
            //用ransomNote的字符来减resultCharCount的字符
            resultCharCount[ransomNote.charAt(i)]--;
            //当resultCharCount小于0说明已经不存在了,所以直接返回false
            if (resultCharCount[ransomNote.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

}
