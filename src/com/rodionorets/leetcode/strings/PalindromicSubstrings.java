package com.rodionorets.leetcode.strings;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int palindromicSubstringsCount = 0;

        for (int i = 0; i < s.length(); i++) {
            palindromicSubstringsCount += countSubstrings(s, i, i);
            palindromicSubstringsCount += countSubstrings(s, i, i + 1);
        }

        return palindromicSubstringsCount;
    }

    private int countSubstrings(String s, int begin, int end) {
        int palindromicSubstringsCount = 0;

        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            palindromicSubstringsCount++;
            begin--;
            end++;
        }

        return palindromicSubstringsCount;
    }
}
