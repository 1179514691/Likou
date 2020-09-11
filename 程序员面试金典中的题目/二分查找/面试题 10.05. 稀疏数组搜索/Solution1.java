package com.yang.binarySearch;

import java.util.HashMap;

public class Solution1 {

    public int findString(String[] words, String s) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],i);
        }
        Integer result = map.get(s);

        if (result == null) {
            return -1;
        }
        return result;
    }

}
