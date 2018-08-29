package com.rodionorets.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int verticalDistance = 0;
        int horizontalDistance = 0;

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            if (move == 'U') verticalDistance++;
            if (move == 'D') verticalDistance--;

            if (move == 'R') horizontalDistance++;
            if (move == 'L') horizontalDistance--;
        }

        return verticalDistance == 0 && horizontalDistance == 0;
    }
}
