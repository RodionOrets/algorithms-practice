package com.rodionorets.leetcode.strings;

public class IsSubsequence {
    public boolean isSubsequence(String string, String subsequence) {
        char[] stringChars = string.toCharArray();
        char[] subsequenceChars = subsequence.toCharArray();

        int stringRunner = 0;
        int subsequenceRunner = 0;

        while (stringRunner < string.length() && subsequenceRunner < subsequence.length()) {
            if (stringChars[stringRunner] == subsequenceChars[subsequenceRunner]) {
                stringRunner++;
            }
            subsequenceRunner++;
        }

        return stringRunner == string.length();
    }
}
