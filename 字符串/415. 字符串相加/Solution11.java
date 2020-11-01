package com.liko.string;

public class Solution11 {
    public String addStrings(String num1, String num2) {
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0; //用来表示进位

        while(num1Index >= 0 || num2Index >= 0 || carry > 0) {
            int x = num1Index >= 0 ? (num1.charAt(num1Index) - '0') : 0;
            int y = num2Index >= 0 ? (num2.charAt(num2Index) - '0') : 0;


            sb.append( (x+y+carry)%10 );
            carry = (x+y+carry)/10;
            num1Index--;
            num2Index--;
        }

        //进行颠倒,因为我们每次最后1位都是放在第一位
        return sb.reverse().toString();
    }
}
