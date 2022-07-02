package com.rodionorets.leetcode.strings;

public class ReverseString {
    public String reverseString(String s) {
        char[] reversed = new char[s.length()];

        for (int back = s.length() - 1, front = 0; back >= 0 && front < s.length(); back--, front++) {
            reversed[front] = s.charAt(back);
        }

        return String.valueOf(reversed);
    }
}
