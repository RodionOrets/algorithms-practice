package com.rodionorets.leetcode.strings;

public class CustomSortString {
    public String customSortString(String S, String T) {
        int[] characterCounts = new int[26];
        for (char c : T.toCharArray()) {
            ++characterCounts[c - 'a'];
        }

        StringBuilder customSortString = new StringBuilder();

        for (char c : S.toCharArray()) {
            while (characterCounts[c - 'a']-- > 0) {
                customSortString.append(c);
            }
        }

        for (char c = 'a'; c <= 'z'; ++c) {
            while (characterCounts[c - 'a']-- > 0) {
                customSortString.append(c);
            }
        }

        return customSortString.toString();
    }
}
