package com.rodionorets.leetcode.strings;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int firstRunner = 0;
        int secondRunner = 0;

        while (firstRunner < s.length() && secondRunner < t.length()) {
            if (sCharArray[firstRunner] == tCharArray[secondRunner]) {
                firstRunner++;
                secondRunner++;
            } else {
                secondRunner++;
            }
        }

        return firstRunner == s.length();
    }
}
