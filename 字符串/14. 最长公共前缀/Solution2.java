package com.liko.string;

public class Solution2 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs.length == 1) {
            return strs.length == 0 ? "" : strs[0];
        }

        int minStrLen = strs[0].length();
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            if (minStrLen > strs[i].length()) {
                minStrLen = strs[i].length();
                index = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < minStrLen; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (j == index) {
                    continue;
                }

                if (strs[index].charAt(i) != strs[j].charAt(i)) {
                    flag = true;
                    break;
                }

            }
            if (flag) {
                break;
            }else {
                sb.append(strs[0].charAt(i));
            }
        }

        return sb.toString();
    }

    public String longestCommonPrefix2(String[] strs) {

        if (strs.length == 0 || strs.length == 1) {
            return strs.length == 0 ? "" : strs[0];
        }


        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        for (int i = 0; i < strs[0].length(); i++) {

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    flag = true;
                    break;
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }else {
                sb.append(strs[0].charAt(i));
            }

        }


        return sb.toString();
    }


}
