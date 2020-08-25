package com.yang.array;

import java.util.ArrayList;
import java.util.List;

/*
    计算机有4个槽，每个槽放一个球，颜色可能是红色（R）、黄色（Y）、绿色（G）或蓝色（B）。
    例如，计算机可能有RGGB 4种（槽1为红色，槽2、3为绿色，槽4为蓝色）。作为用户，你试图猜出颜色组合。
    打个比方，你可能会猜YRGB。要是猜对某个槽的颜色，则算一次“猜中”；要是只猜对颜色但槽位猜错了，则算一次“伪猜中”。
    注意，“猜中”不能算入“伪猜中”。

 */
public class Solution6 {
    public int[] masterMind(String solution, String guess) {

        char[] c1 = solution.toCharArray(); //转换成字符数组
        char[] c2 = guess.toCharArray(); //转换成字符数组
        int[] result = new int[2];  //结果
        int[] answer = new int[4]; // 0表示没有猜中, 1表示猜中, 2表示伪猜中

        for (int i = 0; i < 4; i++) {
            if (c1[i] == c2[i]) { //判断是否猜中
                answer[i] = 1;  //猜中 置为1
                result[0]++; //结果+1
            }else {
                for (int j = 0; j < 4; j++) {
                    if (i == j) { //表示两个是否相同, 上面已经比较过了,如何直接跳过
                        continue;
                    }
                    //判断是否伪猜中,并且是否是没有标记的,并且不是猜中
                    if (c1[i] == c2[j] && answer[j] == 0 && c1[j] != c2[j]) {
                        answer[j] = 2; //置为2
                        result[1]++;   //结果+1
                        break;
                    }
                }
            }
        }


        return result;
    }
}
