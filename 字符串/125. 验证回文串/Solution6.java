package com.liko.string;

public class Solution6 {
    public boolean isPalindrome(String s) {

        //统一转换成小写
        String lowerCaseStr = s.toLowerCase();

        //转换成字符数组
        char[] chars = lowerCaseStr.toCharArray();
        int l = 0;  //左
        int r = chars.length -1; //右

        while(l < r) {
            //如果不是0到9 或者 97(a) 到 122(z) 直接过滤
            if (chars[l] < '0' || (chars[l] > '9' && chars[l] < 'a') || chars[l] > 'z'){
                l++;
                continue;
            }
            if (chars[r] < '0' || (chars[r] > '9' && chars[r] < 'a') || chars[r] > 'z') {
                r--;
                continue;
            }
            //判断两个是否相同
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
