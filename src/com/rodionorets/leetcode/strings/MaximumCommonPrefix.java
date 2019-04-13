package com.rodionorets.leetcode.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumCommonPrefix {
    public String maxCommonPrefix(List<String> strings) {
        Collections.sort(strings);
        int end = Math.min(strings.get(0).length(), strings.get(strings.size() - 1).length());
        int prefixEnd = 0;
        while (prefixEnd < end && strings.get(0).charAt(prefixEnd) == strings.get(strings.size() - 1).charAt(prefixEnd)) {
            prefixEnd++;
        }
        return strings.get(0).substring(0, prefixEnd);
    }

    public static void main(String[] args) {
        System.out.println(new MaximumCommonPrefix().maxCommonPrefix(Arrays.asList("abccd", "abc", "abewewe", "tttt")));
    }
}
