package com.rodionorets.leetcode.strings;

public class ReverseString {
    public String reverseString(String s) {
        char[] reversed = new char[s.length()];

        for (int i = s.length() - 1, j = 0; i >= 0 && j < s.length(); i--, j++) {
            reversed[j] = s.charAt(i);
        }

        return String.valueOf(reversed);
    }
}
