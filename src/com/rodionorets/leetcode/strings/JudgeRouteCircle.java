package com.rodionorets.leetcode.strings;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int[] hashingArray = new int[26];

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            hashingArray[move - 'A'] += 1;
        }

        return hashingArray['U' - 'A'] == hashingArray['D' - 'A'] && hashingArray['L' - 'A'] == hashingArray['R' - 'A'];
    }
}
