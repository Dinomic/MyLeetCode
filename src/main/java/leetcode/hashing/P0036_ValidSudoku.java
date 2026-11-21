package leetcode.hashing;

import static leetcode.common.Check.*;

/**
 * 36. Valid Sudoku (Medium) - https://leetcode.com/problems/valid-sudoku/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0036_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0036_ValidSudoku sol = new P0036_ValidSudoku();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        check(sol.isValidSudoku(board), true);
        board[0][0] = '8'; // two 8s in column 0 and in the top-left box
        check(sol.isValidSudoku(board), false);
    }
}
