package com.rodionorets.leetcode;

public class ToLowerCase {
    public static String toLowerCase(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            char strChar = str.charAt(i);
            chars[i] = strChar > 64 && strChar < 91 ? (char)(str.charAt(i) + 32) : strChar;
        }

        return new String(chars);
    }
}
