package com.liko.string;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {

        if (s.length() == 0) {
            return 0;
        }


        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
           switch(s.charAt(i)) {
               case 'I' :
                   if (i + 1 < s.length() && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                       sum += s.charAt(i+1) == 'V' ? 4 : 9;
                       i++;
                   }else {
                       sum += 1;
                   }
                   break;
               case 'V' :
                  sum += 5;
                   break;
               case 'X' :
                   if (i+1 < s.length() && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                       sum += s.charAt(i+1) == 'L' ? 40 : 90;
                       i++;
                   }else {
                       sum += 10;
                   }
                   break;
               case 'L' :
                   sum += 50;
                   break;
               case 'C' :
                   if (i+1 < s.length() && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                       sum += s.charAt(i+1) == 'D' ? 400 : 900;
                       i++;
                   }else {
                       sum += 100;
                   }
                   break;
               case 'D' :
                   sum += 500;
                   break;
               case 'M' :
                   sum += 1000;
                   break;
           }
        }

        return sum;
    }
}
