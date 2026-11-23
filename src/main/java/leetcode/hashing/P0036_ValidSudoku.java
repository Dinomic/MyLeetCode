package leetcode.hashing;

import java.util.Arrays;
import java.util.HashMap;

import static leetcode.common.Check.*;

/**
 * 36. Valid Sudoku (Medium) - https://leetcode.com/problems/valid-sudoku/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0036_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] iii = new int[9][9];
        int[] jjj = new int[9];
        int[][][] hash = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = Character.getNumericValue(board[i][j]) - 1;
                if (board[i][j] == '.') continue;
                if (iii[j][num] == 1) {
                    return false;
                }
                iii[j][num] = 1;
                if (jjj[num] == 1) {
                    return false;
                }
                jjj[num] = 1;
                if (hash[i/3][j/3][num] == 1) {
                    return false;
                }
                hash[i/3][j/3][num] = 1;
            }
            jjj = new int[9];
        }
        return true;
    }

    public static void main(String[] args) {
        P0036_ValidSudoku sol = new P0036_ValidSudoku();
//        char[][] board = {
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };
//        check(sol.isValidSudoku(board), true);
//        board[0][0] = '8'; // two 8s in column 0 and in the top-left box
//        check(sol.isValidSudoku(board), false);
        char[][] board = {
            {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
            {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
            {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
            {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        check(sol.isValidSudoku(board), false);
    }
}
