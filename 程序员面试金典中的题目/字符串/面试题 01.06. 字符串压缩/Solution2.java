package com.yang.string;

public class Solution2 {
    public String compressString(String S) {

        StringBuilder sb = new StringBuilder();

        int count = 1; //记录最后一个相同的下标

        int index = 0; //开始的下标
        int endIndex = 0; //最后的下标

        while(index < S.length()) {
            for (endIndex = index + 1; endIndex < S.length(); endIndex++) {
                if (S.charAt(index) == S.charAt(endIndex)) {
                    count++;
                }else {
                    sb.append(S.charAt(index));
                    sb.append(count);
                    index = endIndex; //把最后一个相同的下标给到i
                    break;
                }
            }
            if (endIndex > S.length() -1) {
                sb.append(S.charAt(index));
                sb.append(count);
                break;
            }
            count = 1;
        }


        return sb.toString().length() < S.length() ? sb.toString() : S;
    }

    public String compressString2(String S) {

        int len = S.length();
        if (len <= 2) {
            return S;
        }

        StringBuilder sb = new StringBuilder();

        int index = 0;
        int nextIndex = 1;
        int count = 1;

        while (index < len){
            if (nextIndex <= len -1 && S.charAt(index) == S.charAt(nextIndex)) {
                nextIndex++;
                count++;
            }else {
                    sb.append(S.charAt(index));
                    sb.append(count);
                    index = nextIndex;
                    nextIndex++;
                    count = 1;

            }
        }

        return sb.toString().length() < len ? sb.toString() : S;
    }
}
