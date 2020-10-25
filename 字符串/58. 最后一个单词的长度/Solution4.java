package com.liko.string;

public class Solution4 {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split.length == 0 ? 0 : split[split.length -1].length();
    }
    public int lengthOfLastWord2(String s) {

        String trim = s.trim();

        //换成字符数组
        char[] ch = trim.toCharArray();

        int count = 0;  //计数

        for (int i = ch.length - 1; i >= 0; i--) {

           if (ch[i] == ' ' && count != 0) {
               break;
           }else if (ch[i] != ' ') {
               count++;
           }else {
               return 0;
           }
        }

        return count;
    }

}
