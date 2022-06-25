package com.rodionorets.leetcode.strings;

public class IsSubstring {

    public static boolean isSubsrting(String string, String substring) {
        int substringRunner = 0;

        for (int stringRunner = 0; stringRunner < string.length(); stringRunner++) {
            if (string.charAt(stringRunner) == substring.charAt(substringRunner)) {
                substringRunner++;
            } else {
                substringRunner = 0;
            }
        }

        return substringRunner == substring.length() - 1;
    }

}
