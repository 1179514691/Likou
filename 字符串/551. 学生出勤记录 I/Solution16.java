package com.liko.string;

public class Solution16 {
    public boolean checkRecord(String s) {
        int countA = 0; //统计缺勤次数
        int countL = 0; //统计迟到次数

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    //缺勤++
                    countA++;
                    //当是缺勤时,说明连续迟到的次数就断了,所以置为0
                    countL = 0;
                    break;
                case 'L':
                    //迟到++
                    countL++;
                    break;
                case 'P':
                    //当是到场时,说明连续迟到的次数就断了,所以置为0
                    countL = 0;
                    break;
            }
            //判断是否连续迟到以及缺勤是否超过1
            if (countL > 2 || countA >= 2) {
                return false;
            }

        }
        return true;
    }
}
