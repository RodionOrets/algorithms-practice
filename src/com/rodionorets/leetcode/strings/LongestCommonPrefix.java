package com.rodionorets.leetcode.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String flag = strs[0];
        for (int prefixLen = 0; prefixLen < flag.length(); prefixLen++) {
            char c = flag.charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() == prefixLen || strs[i].charAt(prefixLen) != c) {
                    return flag.substring(0, prefixLen);
                }
            }
        }

        return flag;
    }
}
