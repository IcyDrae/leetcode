package com.icydrae.leetcode.Solutions;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/valid-sudoku/
public class Problem007ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int gridNumber = (i / 3) * 3 + (j / 3);

                if (board[i][j] != '.') {
                    boolean isPresentInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresentInColumn = colSet[j].contains(board[i][j]);
                    boolean isPresentInGrid = gridSet[gridNumber].contains(board[i][j]);

                    if (isPresentInRow || isPresentInColumn || isPresentInGrid) {
                        return false;
                    }

                    rowSet[i].add(board[i][j]);
                    colSet[j].add(board[i][j]);
                    gridSet[gridNumber].add(board[i][j]);
                }
            }
        }

        return true;
    }
}
