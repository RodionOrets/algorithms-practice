package com.rodionorets.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> movesCounts = new HashMap<>();

        movesCounts.put('U', 0);
        movesCounts.put('D', 0);
        movesCounts.put('L', 0);
        movesCounts.put('R', 0);

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            Integer moveCount = movesCounts.get(move);
            moveCount++;
            movesCounts.put(move, moveCount);
        }

        return movesCounts.get('U') == movesCounts.get('D') && movesCounts.get('L') == movesCounts.get('R');
    }
}
