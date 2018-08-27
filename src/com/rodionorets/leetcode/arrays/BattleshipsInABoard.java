package com.rodionorets.leetcode.arrays;

public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int rowsNum = board.length;
        if (rowsNum == 0) return 0;
        int columnsNum = board[0].length;

        int count = 0;

        for (int i = 0; i < rowsNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i-1][j] == 'X') continue;
                if (j > 0 && board[i][j-1] == 'X') continue;
                count++;
            }
        }

        return count;
    }
}
