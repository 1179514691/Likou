package com.yang.array;

import java.util.Arrays;

/*
    URL化。编写一种方法，将字符串中的空格全部替换为%20。
    假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
    （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 */
public class Solution3 {
    public String replaceSpaces(String S, int length) {

        StringBuilder str = new StringBuilder();

       for (int i = 0; i < length; i++) {
           if (S.charAt(i) == ' ') {
               str.append("%20");
           }else {
               str.append(S.charAt(i));
           }
       }
        return str.toString();
    }

    public String replaceSpaces2(String S, int length) {
        //转换成字符数组
        char[] chars = S.toCharArray();
        //创建新的数组
        char[] newChar = new char[length * 3];

        int count = 0; //标记newChar最终的下标

        //循环遍历
        for (int i = 0; i < length; i++) {
            //判断是不是空格
            if (chars[i] == ' ') { //是
                newChar[count++] = '%';
                newChar[count++] = '2';
                newChar[count++] = '0';
            }else {
                //不是
                newChar[count++] = chars[i];
            }
        }

        return new String(newChar,0,count);
    }
}
