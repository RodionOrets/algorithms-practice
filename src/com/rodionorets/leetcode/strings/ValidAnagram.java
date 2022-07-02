package com.rodionorets.leetcode.strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sCounts = new int[26];
        int[] tCounts = new int[26];

        for (char c : s.toCharArray()) {
            sCounts[(int)(c) - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tCounts[(int)(c) - 'a']++;
        }

        for (int i = 0; i < sCounts.length; i++) {
            if (sCounts[i] != tCounts[i]) return false;
        }

        return true;
    }
}
