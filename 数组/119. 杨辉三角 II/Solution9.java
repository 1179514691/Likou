package com.liko.array;

import java.util.ArrayList;
import java.util.List;

public class Solution9 {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j== i) {
                    list.add(1);
                }else {
                    list.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
                }
            }
            lists.add(list);
        }

        return lists.get(rowIndex);
    }

}
