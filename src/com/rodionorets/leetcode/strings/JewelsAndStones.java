package com.rodionorets.leetcode.strings;

public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {
        int numJewelsInStones = 0;
        for (int jewelsCount = 0; jewelsCount < J.length(); jewelsCount++) {
            for (int stonesCount = 0; stonesCount < S.length(); stonesCount++) {
                if (J.charAt(jewelsCount) == S.charAt(stonesCount)) {
                    numJewelsInStones++;
                }
            }
        }

        return numJewelsInStones;
    }

}
